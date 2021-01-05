package com.thirdware.librarymngmt.history.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.borrowerdetails.dao.BorrowerDetailsMapperClass;
import com.thirdware.librarymngmt.models.BookSection;
import com.thirdware.librarymngmt.models.History;
import com.thirdware.librarymngmt.models.UserRegistry;
import com.thirdware.librarymngmt.userregistry.dao.UserRegistryMapper;

public class HistoryDaoImp implements HistoryDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<History> getHistory() {

		String sql = "select books.isbnNumber, books.bookName,userRegistry.userId,userRegistry.userName,borrower.dates,borrower.status,borrower.available from\r\n"
				+ "				userRegistry inner join borrower on userRegistry.userId=borrower.userId\r\n"
				+ "				inner join books on books.bookId=borrower.bookId \r\n"
				+ "				inner join bookSection on bookSection.sectionId=books.sectionId";
		List<History> list = jdbcTemplate.query(sql, new HistoryMapperClass());
		return list;
	}

}
