package com.thirdware.librarymngmt.books.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.models.Books;

public class BooksDaoImp implements BooksDao {
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public List<Books> getBooksList() {
		
		String sql="select * from books";
		List<Books> list=jdbcTemplate.query(sql, new BooksMapperClass());
		return list;
	}

	@Override
	public void addBooks(Books book) {
		String sql ="insert into books values (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] {book.getBookImage(),book.getIsbnNumber(),book.getBookName(),book.getAuthorName(),
						book.getDescription(),book.getNoOfBooks(),book.getSectionId()});
	}

	@Override
	public void deleteBook(int bookId) {
		
	String sql ="delete from books where bookId=?";
	jdbcTemplate.update(sql,new Object[] {bookId});
		
	}

	@Override
	public void updateBooks(int bookId, Books book) {
		String sql="update books set bookImage=?,isbnNumber=?,bookName=?,authorName=?,description=?,noOfBooks=?,sectionId=? where bookId=?";
		jdbcTemplate.update(sql,new Object[]
		{ book.getBookImage(),book.getIsbnNumber(),book.getBookName(),book.getAuthorName(),book.getDescription(),
				book.getNoOfBooks(),book.getSectionId(),bookId });
	}

}
