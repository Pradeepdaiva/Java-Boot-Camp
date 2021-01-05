package com.thirdware.librarymngmt.borrowerdetails.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.BorrowerDetails;

public class BorrowerDetailsMapperClass implements RowMapper<BorrowerDetails> {

	@Override
	public BorrowerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		BorrowerDetails borrowerDetails = new BorrowerDetails();
		borrowerDetails.setBorrowId(rs.getInt("borrowId"));
		borrowerDetails.setUserId(rs.getInt("userId"));
		borrowerDetails.setBookId(rs.getInt("bookId"));
		borrowerDetails.setDate(rs.getString("dates"));
		borrowerDetails.setStatus(rs.getString("status"));
		return borrowerDetails;
	}

}
