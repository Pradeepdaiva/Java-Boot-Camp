package com.thirdware.springjdbcconnector;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

public interface PersonDao {

	public List<Person> getPersonList();

	public void setDataSource(DataSource dba);

}
