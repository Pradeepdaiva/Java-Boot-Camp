package com.thirdware.librarymngmt.history.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.History;
import com.thirdware.librarymngmt.models.UserRegistry;

public interface HistoryDao {
	
	public void setDataSource(DataSource dataSource);
	
	public List<History> getHistory();

}
