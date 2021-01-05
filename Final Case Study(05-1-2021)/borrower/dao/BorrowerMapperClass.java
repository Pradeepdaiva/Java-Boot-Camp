package com.thirdware.librarymngmt.borrower.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.Borrower;
import com.thirdware.librarymngmt.models.BorrowerDetails;

public class BorrowerMapperClass implements RowMapper<Borrower> {

	@Override
	public Borrower mapRow(ResultSet rs, int rowNum) throws SQLException {

		Borrower borrower = new Borrower();
		borrower.setBorrowId(rs.getInt("borrowId"));
		borrower.setUserId(rs.getInt("userId"));
		borrower.setBookId(rs.getInt("bookId"));
		borrower.setDate(rs.getString("dates"));
		borrower.setStatus(rs.getString("status"));
		borrower.setAvailable(rs.getInt("available"));
		return borrower;
	}

}
