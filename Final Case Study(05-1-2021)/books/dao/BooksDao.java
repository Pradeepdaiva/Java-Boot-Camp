package com.thirdware.librarymngmt.books.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.Books;

public interface BooksDao {

	public void setDataSource(DataSource dataSource);

	public List<Books> getBooksList();
	
	public void addBooks(Books book);
	
	public void  deleteBook(int bookId);
	
	public void updateBooks(int bookId,Books book);

}
