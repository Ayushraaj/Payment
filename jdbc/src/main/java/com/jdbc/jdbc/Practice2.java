package com.jdbc.jdbc;

import java.sql.*;

public class Practice2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String pass = "Ayush";
		
		
		Connection connection = DriverManager.getConnection(url, username, pass);
		
		PreparedStatement ps =connection.prepareStatement("select * from orders");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String dish_name = rs.getString(2);
			
			
			System.out.println("Dish->"+ id+", name "+ dish_name);
		}
		
		
		
		PreparedStatement ps1 =connection.prepareStatement("insert into orders(dish, status, price) values(?,?,?)");
		
		ps1.setString(1, "burrito");
		ps1.setString(2, "Active");
		ps1.setInt(3, 800);
		
		int count = ps1.executeUpdate();
		if(count>0) {
			System.out.println("A new orders is created");
		}
		
		
		
		PreparedStatement ps2 =connection.prepareStatement("update orders set price=? where dishId=?");
		
		ps2.setInt(1, 600);
		ps2.setInt(2, 5);
		
		int count1 = ps2.executeUpdate();
		
		if(count1>0) {
			System.out.println("Dish with id 5, has been updated");
		}
		
		
PreparedStatement ps3 =connection.prepareStatement("delete from orders  where dishId=?");
		
		ps3.setInt(1, 6);

		
		int count2 = ps3.executeUpdate();
		
		if(count2>0) {
			System.out.println("Dish with id 6, has been removed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
