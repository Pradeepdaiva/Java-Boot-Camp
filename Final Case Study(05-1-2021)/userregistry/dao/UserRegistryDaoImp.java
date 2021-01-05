package com.thirdware.librarymngmt.userregistry.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thirdware.librarymngmt.models.UserRegistry;

public class UserRegistryDaoImp implements UserRegistryDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<UserRegistry> getUserRegistry() {

		String sql = "select * from userRegistry";
		List<UserRegistry> userRegistry = jdbcTemplate.query(sql, new UserRegistryMapper());
		return userRegistry;
	}

	@Override
	public void addUser(UserRegistry userRegistry) {
		String insertSql="insert into userRegistry values(?,?,?,?)";
		jdbcTemplate.update(insertSql,
				new Object[] {userRegistry.getUserName(),userRegistry.getEmail(),
						userRegistry.getPhoneNumber(),userRegistry.getPassword()});
	}

}
