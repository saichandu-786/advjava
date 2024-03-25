package com.jdbc;
		import java.util.*;
		import java.sql.SQLException;

		public class DatabaseClient {
			
			public static void main(String[] args) throws ClassNotFoundException, SQLException   {
				
			ProductDao p =new ProductDao();
//			int res = p.createProductTable();
//			System.out.println("Table created successfully...."+res);
				
				int res1 = p.saveProduct(new Product(111, "bag", 10000));
				System.out.println(res1+" row inserted successfully..");
				
				int res2 = p.saveProduct(new Product(222, "mobile", 20000));
				System.out.println(res2+" row inserted successfully..");
			
				int res3 = p.saveProduct(new Product(333, "laptop", 30000));
				System.out.println(res3+" row inserted successfully..");
				
//				Product res= p.getProductById(111);
//				System.out.println(res);
				
//				List<Product> a = p.getAllProducts();
//				for(Product  a1: a)
//				{
//					System.out.println(a1);
//				}
//				
//				int res4 = p.updatePriceRange(400, 50);
//				System.out.println(res4+" rows are Updated");
				
//				int res5 = p.deleteById(111);
//				System.out.println(res5+" row deleted");
				
//				int res6 = p.deleteByPrice(1000);
//				System.out.println(res6+" row deleted");
				
//				int res7 = p.dropTable();
//				System.out.println(res7+" Table dropped");
				
				
				
				
			}
			
		


	}


