package com.herokuuapp.angular.chatapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.herokuuapp.angular.chatapp.domain.Room;
import com.herokuuapp.angular.chatapp.domain.Type;

public class RoomRowMapper implements RowMapper<Room> {

	@Override
	public Room mapRow(ResultSet rs, int row) throws SQLException {
		Room room = new Room();
		room.setRoomId(rs.getLong("r.roomId"));
		room.setRoomIcon(rs.getString("r.roomIcon"));
		room.setRoomDetails(rs.getString("r.roomDetails"));
		room.setRoomName(rs.getString("r.roomName"));
		Type type = new Type();
		type.setTypeId(rs.getLong("r.roomType"));
		type.setTypeName(rs.getString("t.typeName"));
		room.setRoomType(type);
		return room;
	}

}
