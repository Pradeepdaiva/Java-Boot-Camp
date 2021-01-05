package com.thirdware.librarymngmt.history.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.History;

public class HistoryMapperClass implements RowMapper<History> {

	@Override
	public History mapRow(ResultSet rs, int rowNum) throws SQLException {

        History history = new History();
		history.setIsbnNumber(rs.getInt("isbnNumber"));
		history.setBookName(rs.getString("bookName"));
		history.setUserId(rs.getInt("userId"));
		history.setUserName(rs.getString("userName"));
		history.setDates(rs.getString("dates"));
		history.setStatus(rs.getString("status"));
		history.setAvailable(rs.getInt("available"));
		return history;
	}

}
