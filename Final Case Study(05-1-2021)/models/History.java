package com.thirdware.librarymngmt.models;

public class History {

	private int isbnNumber;
	private String bookName;
	private int userId;
	private String userName;
	private String dates;
	private String status;
	private int available;

	public int getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}
	

}
