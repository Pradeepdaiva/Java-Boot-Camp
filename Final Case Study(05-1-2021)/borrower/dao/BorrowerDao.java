package com.thirdware.librarymngmt.borrower.dao;

import java.util.List;

import javax.sql.DataSource;

import com.thirdware.librarymngmt.models.Borrower;
import com.thirdware.librarymngmt.models.BorrowerDetails;

public interface BorrowerDao {
	
	public void setDataSource(DataSource dataSource);
	
	public List<Borrower>getBorrowerDetails();
	
	public void borrowerDetails(Borrower borrower);
	
	public void deleteBorrower(int borrowerUserId);
	
	public void updateBorrower(int userId,Borrower borrower);
	

}
