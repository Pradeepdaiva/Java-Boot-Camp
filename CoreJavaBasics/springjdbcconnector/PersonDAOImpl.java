package com.thirdware.springjdbcconnector;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class PersonDAOImpl implements PersonDao {

	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Person> getPersonList() {
		String sql = "select * from Persons where PersonId=1";
		List<Person> personList = jdbcTemplate.query(sql, new PersonMapperClass());
		return personList;
	}

	@Override
	public void setDataSource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

}
