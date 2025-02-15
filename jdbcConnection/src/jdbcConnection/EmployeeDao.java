package jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	//

/*	public int save(Employee per) { // declare the resources Connection
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int count = 0;

		try {
			connection = DbConnection.createConeection();

			preparedStatement = connection.prepareStatement("insert into per values(?,?,?)");

			// read the from per object and set to parameters
			preparedStatement.setInt(1, per.getId());
			preparedStatement.setString(2, per.getName());
			preparedStatement.setDouble(3, per.getSalary());
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { // before release connection check the
//	  connection present or not 
	  if(connection!=null)

	  connection.close();

				if (preparedStatement != null)

					preparedStatement.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;

	}

	// FIND BYID() METHOD

	/*
	 * public static Employee findById(int Id) {
	 * 
	 * Employee employee=null;
	 * 
	 * //try-with resources try( Connection
	 * connection=DbConnection.createConeection(); PreparedStatement
	 * preparedStatement=connection.prepareStatement("select * from per where Id=?")
	 * ){ // set the parameter preparedStatement.setInt(1,Id); ResultSet
	 * resultSet=preparedStatement.executeQuery();
	 * 
	 * if(resultSet.next()) { employee=new Employee();
	 * 
	 * employee.setId(resultSet.getInt(1));
	 * employee.setName(resultSet.getString(2));
	 * employee.setSalary(resultSet.getDouble(3)); 
	 * }
	
	 * } catch (SQLException e) 
	 * { 
	 * e.printStackTrace(); 
	 * } return employee;
	 *  } 
      }
	 */

	// DELETE BYID() METHOD

	/*
	 * public static int deleteById(int Id) { int count=0;
	 * 
	 * try ( Connection connection=DbConnection.createConeection();
	 * PreparedStatement
	 * preparedStatement=connection.prepareStatement("delete from per where Id=?");)
	 * { preparedStatement.setInt(1,Id);
	 * 
	 * count=preparedStatement.executeUpdate(); }
	 * 
	 * 
	 * catch(SQLException e) { e.printStackTrace(); } return count; } }
	 */

	
	  // DELETE BYSALARY() METHOD
	/*public static int deleteBySalary(double Salary) {
	  int count=0;
	 
	  try ( Connection connection=DbConnection.createConeection();
	  PreparedStatement
	  preparedStatement=connection.prepareStatement("delete from per where Salary>?");)
	  { preparedStatement.setDouble(1,Salary);
	  
	  count=preparedStatement.executeUpdate();
	  }
	 catch(SQLException e)
	  {
		 e.printStackTrace(); 
	 } return count;
	 } }
	 

	/*public static List<Employee> findAll() {
		List<Employee> al = new ArrayList<Employee>();

		try (Connection connection = DbConnection.createConeection();
				Statement statement = connection.createStatement();) {
			ResultSet resultSet = statement.executeQuery("select * from per");

			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
				al.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
}*/

	// update salary()
	
	public static int updateSalary(double conditionSalary, double incSalary)
	{
		int count=0;
		try(
				Connection connection = DbConnection.createConeection();
				PreparedStatement preparedStatement = connection.prepareStatement("update per set Salary=Salary+? where Salary>?");	)
		{
			preparedStatement.setDouble(1,incSalary);
			preparedStatement.setDouble(2, conditionSalary);
			
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
}