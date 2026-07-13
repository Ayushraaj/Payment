package com.Ecom.Ecom;

import java.sql.*;
import java.util.Scanner;




public class User {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/user";
		String username = "root";
		String pass = "Ayush";
		
		Connection connection =DriverManager.getConnection(url, username, pass);
		System.out.println("Enter you user id");
		Scanner sc = new Scanner(System.in);
		int user_id = sc.nextInt();
		PreparedStatement ps1 = connection.prepareStatement("select * from user where id =?");
		
		ps1.setInt(1, user_id);
		
		
		
		System.out.println("Enter product id");
		
		int product_id = sc.nextInt();
		PreparedStatement ps2 = connection.prepareStatement("select stock_quantity, price from products where product_id =?");
		
		ps2.setInt(1, product_id);
		int Quantity=0;
		int price=0;
		ResultSet rs = ps2.executeQuery();
		while(rs.next()) {
			Quantity= rs.getInt(1);
			price= rs.getInt(2);
			
		}
		
		
		
		
		PreparedStatement ps4 = connection.prepareStatement("insert into order_items(order_id, product_id, quantity, price) values (?,?,?,?)");
		 ps4.setInt(1,user_id);
		 ps4.setInt(2,product_id);
		 ps4.setInt(3,Quantity);
		 ps4.setInt(4,price);
		 
		 int order_item = ps4.executeUpdate();
		 if(order_item>0) {
			 
			 System.out.println("user has selected one order_items to view");
		 }
		 
		
		 
		 
		 
		 
			
		
	
	
	
	//---------------------------------------------------------------------------------------
	
	
	
    
	
	}

		

		
		
		
		
//		// get user detail
//		
//		PreparedStatement ps = connection.prepareStatement("select * from user");
//		 ResultSet rs = ps.executeQuery();
//		 
//		 
//
//		 
//		 while(rs.next()) {
//			 int id = rs.getInt(1);
//			 
//			 String name = rs.getString(2);
//			 String email = rs.getString(3);
//			 Long mobile_number = rs.getLong(4);
//
//			 
//			 System.out.println("Id-> "+ id+ "User name->" + name+ "Email-> "+ email + "mobile_number-> " + mobile_number);
//		 }
//		 
//
//		 
//		 /// creating a user while validating 
//		 
//			    String query = "INSERT INTO user(customer_name, email_id, mobile_number) VALUES (?, ?, ?)";
//
//			    try (PreparedStatement ps3 = connection.prepareStatement(query)) {
//
//			        ps3.setString(1, "Dummy");
//			        ps3.setString(2, "Dummy@gmail.com");
//			        ps3.setLong(3, 9987654321L);
//
//			        int row1 = ps3.executeUpdate();
//			        if(row1>0) {
//			        	System.out.println("A new user has been created Successfully");
//			        }
//
//			    } catch (SQLException e) {
//			        System.out.println(e);
//			    }
//			}
//		 
		 
	
}
