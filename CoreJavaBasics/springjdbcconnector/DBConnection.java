package com.thirdware.springjdbcconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	//String name = "";
	String dbURL = "jdbc:sqlserver://COM1920TGS00012\\MSSQLSERVER;databaseName=empdb";
	String name = "sa";
	String password = "12345";
	
	public Connection getconnection() throws SQLException {
		Connection con = DriverManager.getConnection(dbURL, name, password);
		return con;
	}
}
