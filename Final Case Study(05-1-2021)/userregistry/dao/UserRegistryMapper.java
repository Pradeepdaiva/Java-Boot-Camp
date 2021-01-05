package com.thirdware.librarymngmt.userregistry.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.UserRegistry;

public class UserRegistryMapper implements RowMapper<UserRegistry> {

	@Override
	public UserRegistry mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserRegistry userRegistry = new UserRegistry();
		userRegistry.setUserId(rs.getInt("userId"));
		userRegistry.setUserName(rs.getString("userName"));
		userRegistry.setEmail(rs.getString("emailId"));
		userRegistry.setPhoneNumber(rs.getString("phoneNumber"));
		userRegistry.setPassword(rs.getString("password"));
		return userRegistry;
	}
	

}
