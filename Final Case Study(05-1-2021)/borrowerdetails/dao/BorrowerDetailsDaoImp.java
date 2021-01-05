package com.thirdware.librarymngmt.borrowerdetails.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.models.BorrowerDetails;

public class BorrowerDetailsDaoImp implements BorrowerDetailsDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<BorrowerDetails> getBorrowerDetails() {

		String sql = "select * from borrowerDetails";
		List<BorrowerDetails> list = jdbcTemplate.query(sql, new BorrowerDetailsMapperClass());
		return list;
	}

	@Override
	public void borrowerDetails(BorrowerDetails borrower) {

		String sql = "insert into borrowerDetails (userId,bookId,status) values (?,?,?)";
		jdbcTemplate.update(sql, new Object[] { borrower.getUserId(), borrower.getBookId(),
				borrower.getStatus() });
	}

	@Override
	public void deleteBorrower(int borrowerUserId) {
		String sql = "delete from borrowerDetails where userId=?";
		jdbcTemplate.update(sql, new Object[] { borrowerUserId });

	}

}
