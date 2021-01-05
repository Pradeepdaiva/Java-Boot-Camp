package com.thirdware.librarymngmt.borrowerdetails.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.BorrowerDetails;

public interface BorrowerDetailsDao {
	
	public void setDataSource(DataSource dataSource);
	
	public List<BorrowerDetails> getBorrowerDetails();
	
	public void borrowerDetails(BorrowerDetails borrower);
	
	public void deleteBorrower(int borrowerUserId);
	

}
