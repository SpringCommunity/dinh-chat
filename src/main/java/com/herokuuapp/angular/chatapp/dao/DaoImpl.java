package com.herokuuapp.angular.chatapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.herokuuapp.angular.chatapp.domain.Room;
import com.herokuuapp.angular.chatapp.domain.User;
import com.herokuuapp.angular.chatapp.rowmapper.RoomRowMapper;
import com.herokuuapp.angular.chatapp.rowmapper.UserRowMapper;

@Repository
public class DaoImpl implements Dao {
	
	Logger logger = Logger.getLogger(DaoImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Room> findAllRoom() {
		String sql = "SELECT * from Room as r JOIN Type as t ON r.roomType = t.typeId";
		RowMapper<Room> rm = new RoomRowMapper();
		try {
			List<Room> rooms = jdbcTemplate.query(sql, rm);
			return rooms;
		} catch (DataAccessException e) {
			logger.error("NO ROOM FOUND CAUSE:: "+e);
			return null;
		}
	}

	@Override
	public Room findRoomById(long roomId) {
		String sql = "SELECT *  from Room as r JOIN Type as t ON r.roomType = t.typeId WHERE r.roomId = :roomId";
		RowMapper<Room> rm = new RoomRowMapper();
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("roomId", roomId);
		try {
			Room room = jdbcTemplate.queryForObject(sql, paramMap, rm);
			return room;
		} catch (DataAccessException e) {
			logger.error("NO ROOM FOUND BY THIS ID CAUSE:: "+e);
			return new Room();
		}
	}

	@Override
	public int createNewUser(User user) {
		String sql = "INSERT INTO User(userFullName, userEmail, userPassword) VALUES (:userFullName, :userEmail, :userPassword)";
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("userEmail", user.getUserEmail());
		paramMap.addValue("userFullName", user.getUserFullName());
		paramMap.addValue("userPassword", user.getUserPassword());
		try {
			int row = jdbcTemplate.update(sql, paramMap);
			return row;
		} catch (DataAccessException e) {
			logger.error("COULD NOT CREATE NEW USER CAUSE:: "+e);
			return 0;
		}
	}

	@Override
	public List<User> findAllUser() {
		String sql = "SELECT * FROM User";
		RowMapper<User> rm = new UserRowMapper();
		try {
			List<User> users = jdbcTemplate.query(sql, rm);
			return users;
		} catch (DataAccessException e) {
			logger.error("NO USER FOUND CAUSE:: "+e);
			return null;
		}
	}

}
