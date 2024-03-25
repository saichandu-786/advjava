package com.jdbc;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {
	
/*	public int createProductTable() throws ClassNotFoundException, SQLException
	{
	     
		Connection connection= DbConnection.createConnection();
		
		
		Statement statement= connection.createStatement();
		
		//execute the query
		int count = statement.executeUpdate("create table product1(proid number, proname varchar2(30), proprice number)");
	
		return count;
	}
	}*/
	public int saveProduct(Product product) throws SQLException, ClassNotFoundException
	{
		//create the connection
		Connection connection=DbConnection.createConnection();
		
		//dynamic query
		PreparedStatement preparedStatement = connection.prepareStatement("insert into product1 values(?,?,?)");
		
		//pass the values to ?
		preparedStatement.setInt(1, product.proid);
		preparedStatement.setString(2, product.proname);
		preparedStatement.setDouble(3, product.proprice);
		
		//execute the dynamic query 
		int count = preparedStatement.executeUpdate();
		
		return count;	
	}
	/*public Product getProductById(int id) throws ClassNotFoundException, SQLException
	{
		//create the connection
		Connection connection = DbConnection.createConnection();
		
		//dynamic query
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from product1 where proid = ?");
		
		//pass the emp value
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		Product p=null;
		//resultset  to product object 
		while(resultSet.next())
		{
			p = new Product();
			p.setProid(resultSet.getInt(1));
			p.setProname(resultSet.getString(2));
			p.setProprice(resultSet.getDouble(3));
		}
		
		return p;
	}
	
	public List<Product> getAllProducts() throws ClassNotFoundException, SQLException
	{
		
		ArrayList<Product> l = new ArrayList<Product>();
		//create the connection
		Connection connection = DbConnection.createConnection();
		
		//dynamic query 
		Statement statement = connection.createStatement();
		
		//execute the query 
		ResultSet resultSet= statement.executeQuery("Select * from product1");
		
		while(resultSet.next())
		{
			Product p = new Product();
			p.setProid(resultSet.getInt(1));
			p.setProname(resultSet.getString(2));
			p.setProprice(resultSet.getDouble(3));
			
			l.add(p);
		}
		
		return l;
	}
	
	public int updatePriceRange(double priceRange, double IncrementValue) throws ClassNotFoundException, SQLException
	{
		Connection connection = DbConnection.createConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("update product1 set proprice = proprice + ? where proprice > ?");
		
		preparedStatement.setDouble(1, IncrementValue);
		preparedStatement.setDouble(2, priceRange);
		
		int count = preparedStatement.executeUpdate();
		
		return count;
	}
	public int deleteById(int id) throws SQLException, ClassNotFoundException
	{
		Connection connection = DbConnection.createConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product1 where proid=?");
		
		preparedStatement.setInt(1, id);
		
		int count = preparedStatement.executeUpdate();
		
		return count;
	}
	
	public int deleteByPrice(double price) throws ClassNotFoundException, SQLException
	{
		Connection connection = DbConnection.createConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product1 where proprice > ? ");
		
		preparedStatement.setDouble(1, price);
		
		int count = preparedStatement.executeUpdate();
		
		return count;
	}
	
	public int dropTable() throws SQLException, ClassNotFoundException
	{
		Connection connection = DbConnection.createConnection();
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("Drop table product1");
		
		return count;*/
}

	
	


