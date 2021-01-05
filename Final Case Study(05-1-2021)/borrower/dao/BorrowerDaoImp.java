package com.thirdware.librarymngmt.borrower.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.models.Borrower;
import com.thirdware.librarymngmt.models.BorrowerDetails;

public class BorrowerDaoImp implements BorrowerDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Borrower> getBorrowerDetails() {

		String sql = "select * from borrower";
		List<Borrower> list = jdbcTemplate.query(sql, new BorrowerMapperClass());
		return list;
	}

	@Override
	public void borrowerDetails(Borrower borrower) {

		String sql = "insert into borrower (userId,bookId,status,available) values (?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { borrower.getUserId(), borrower.getBookId(),
				borrower.getStatus(),borrower.getAvailable() });
	}

	@Override
	public void deleteBorrower(int borrowerUserId) {
		String sql = "delete from borrower where userId=?";
		jdbcTemplate.update(sql, new Object[] { borrowerUserId });

	}

	@Override
	public void updateBorrower(int userId,Borrower borrower) {
		
		String sql="update borrower set available=1 where userId=? and bookId=?";
		jdbcTemplate.update(sql,new Object[] {userId,borrower.getBookId() });
		
	}
	

}
