package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
   public static Connection createConeection() throws SQLException
   {
	  Connection connection=null;
	  
	  try {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		 
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	
	  }
	  catch(ClassNotFoundException | SQLException e) 
	  {
		  e.printStackTrace(); 
	  }
	return connection;
   }
}
