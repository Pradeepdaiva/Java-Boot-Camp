package com.thirdware.librarymngmt.booksection.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.models.BookSection;

public class BookSectionDaoImp implements BookSectionDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public List<BookSection> getBookSection() {
		
		String sql="select * from bookSection";
		List<BookSection> list=jdbcTemplate.query(sql, new BookSectionMapper());
		return list;
	}

	@Override
	public void addBookSection(BookSection bookSection) {
		
		String sql="insert into bookSection values (?)";
		jdbcTemplate.update(sql,
				new Object[] {bookSection.getSectionName()});
		
	}

	@Override
	public void deleteBookSection(int bookSectionId) {
		
		String sql ="delete from bookSection where sectionId=?";
		jdbcTemplate.update(sql,new Object[] {bookSectionId});
	}

	@Override
	public void updateBookSection(int sectionId, BookSection bookSection) {
		
		String sql="update bookSection set sectionName=? where sectionId=? ";
		jdbcTemplate.update(sql,new Object[]
				{ bookSection.getSectionName(),sectionId });
	}

}
