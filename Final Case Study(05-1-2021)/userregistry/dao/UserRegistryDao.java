package com.thirdware.librarymngmt.userregistry.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.UserRegistry;

public interface UserRegistryDao {

	public void setDataSource(DataSource dataSource);

	public List<UserRegistry> getUserRegistry();

	public void addUser(UserRegistry userRegistry);

}
