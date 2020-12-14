package com.thirdware.springjdbcconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Connection {

	public static void main(String[] args) throws SQLException {
		String dbURL = "jdbc:sqlserver://COM1920TGS00012\\MSSQLSERVER;databaseName=empdb";
		String name = "sa";
		String password = "12345";
		Connection con = DriverManager.getConnection(dbURL, name, password);
		System.out.println("Connected successful");
		// Statement st=con.prepareStatement("create table details(id int,department
		// varchar(20) ,location varchar(20))");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
//		st.addBatch("insert into details values (1,'IT','Chennai')");
//		st.addBatch("insert into details values (2,'Network','Maduri')");
//		st.addBatch("insert into details values (3,'HR','AnnaNagar')");
//		st.addBatch("delete from details where id=3");
		//st.executeBatch();
		while(rs.next()) {
		System.out.println(rs.getString("ID")+"  "+rs.getString("Name"));
		}
		con.close();
	}


	}

