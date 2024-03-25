package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
   public static Connection createConnection() throws SQLException
   {
	  Connection connection=null;
	  
	  try {
		  Class.forName("com.jdbc.cj.mysql.Driver");
		 
			connection=DriverManager.getConnection("jdbc:mysql://localhost/chandu","root","chandu");
	
	  }
	  catch(ClassNotFoundException | SQLException e) 
	  {
		  e.printStackTrace(); 
	  }
	return connection;
   }
}




