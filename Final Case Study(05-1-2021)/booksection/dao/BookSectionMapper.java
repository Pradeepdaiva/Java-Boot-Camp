package com.thirdware.librarymngmt.booksection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.BookSection;

public class BookSectionMapper implements RowMapper<BookSection> {

	@Override
	public BookSection mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BookSection bookSection=new BookSection();
		bookSection.setSectionId(rs.getInt("sectionId"));
		bookSection.setSectionName(rs.getString("sectionName"));
		return bookSection;
	}

}
