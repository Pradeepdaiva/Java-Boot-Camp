package com.thirdware.librarymngmt.booksection.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.BookSection;
import com.thirdware.librarymngmt.models.Books;

public interface BookSectionDao {
	
	public void setDataSource(DataSource dataSource);
	
	public List<BookSection> getBookSection();
	
	public void addBookSection(BookSection bookSection);
	
	public void  deleteBookSection(int bookId);
	
	public void updateBookSection(int sectionId,BookSection bookSection);

	

}
