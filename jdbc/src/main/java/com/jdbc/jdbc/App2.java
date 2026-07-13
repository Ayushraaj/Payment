//package com.jdbc.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class App2 {
//	
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		String url = "jdbc:mysql://localhost:3306/sakila";
//		String username = "root";
//		String pass = "Ayush";
//		
//		Connection connection = DriverManager.getConnection(url, username, pass);
//		
//		Statement statement = connection.createStatement();
//		
//		ResultSet rs = statement.executeQuery("Select * from actor");
//		
//		while(rs.next()) {
//			int id = rs.getInt(1);
//			if(id==201) {
//			
//			String name = rs.getString(2);
//			
//			System.out.println("The name of the actor is -> " + name);
//		}
//		}
//		
//	}
//	
//
//}
