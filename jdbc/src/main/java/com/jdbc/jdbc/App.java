//package com.jdbc.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class App   {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	
//	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	 String url = "jdbc:mysql://localhost:3306/jdbc";
//
//     String username = "root";
//     String password = "Ayush"; 
//	
//	Connection connection = DriverManager.getConnection(url, username, password);
//	
//	Statement statement = connection.createStatement();
//	
//	 ResultSet rs = statement.executeQuery("select * from orders");
//	 
//	 while(rs.next()) {
//		 
////		 int dishId = rs.getInt(1);
//		 String dishName = rs.getString(2);
////		 String status = rs.getString(3);
////		 int price = rs.getInt(4);
//		 
//		 //String Name = rs.getString(2);
//		 
//		 //System.out.println("DishId-> "+ dishId + " DishName-> " + dishName +"Status-> " + status + "Price-> "+ price);
//		 
//		 System.out.println("Dish name in the db -> " + dishName.toUpperCase());
//		 
//				 
//	 }
//}
//	 
//	
//
//}
