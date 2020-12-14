package com.thirdware.springjdbcconnector;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

public class PersonMapperClass implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setId(rs.getInt("PersonId"));
		person.setName(rs.getString("Name"));
		person.setAge(rs.getInt("Age"));
		return person;
	}

}
