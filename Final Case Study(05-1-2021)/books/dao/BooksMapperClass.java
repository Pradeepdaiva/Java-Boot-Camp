package com.thirdware.librarymngmt.books.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.thirdware.librarymngmt.models.Books;

public class BooksMapperClass implements RowMapper<Books> {

	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {

		Books books=new Books();
		books.setBookId(rs.getInt("bookId"));
		books.setBookImage(rs.getString("bookImage"));
		books.setIsbnNumber(rs.getInt("isbnNumber"));
		books.setBookName(rs.getString("bookName"));
		books.setAuthorName(rs.getString("authorName"));
		books.setDescription(rs.getString("description"));
		books.setNoOfBooks(rs.getInt("noOfBooks"));
		books.setSectionId(rs.getInt("sectionId"));
		return books;
	}

}
