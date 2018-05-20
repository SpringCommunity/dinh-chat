package com.herokuuapp.angular.chatapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.herokuuapp.angular.chatapp.domain.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int row) throws SQLException {
		User user = new User();
		user.setUserEmail(rs.getString("userEmail"));
		user.setUserFullName(rs.getString("userFullName"));
		user.setUserId(rs.getLong("userId"));
		user.setUserPassword(rs.getString("userPassword"));
		return user;
	}

}
