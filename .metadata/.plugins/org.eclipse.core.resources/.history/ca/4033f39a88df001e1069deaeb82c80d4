package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDriver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		    // load the driver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 System.out.println("driver loaded successfully");
		 
		 // create the connection
		 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				 System.out.println("connection created successfully");
				 
		// process the query
				 Statement statement=connection.createStatement();
				 
			String q1="create table per(Id number,Name varchar2(25),Salary number)";
				 int res1=statement.executeUpdate(q1);
				 System.out.println("table created successfully.."+res1);
				
				/* String q2="drop table per";
				 int res2=statement.executeUpdate(q2);
				 System.out.println("table dropped successfully.."+res2);
				*/ 
				 //close the resources
				 connection.close();
				 System.out.println("connection closed successfully");
				 

	}

}
