package com.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class Practice {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username ="root";
		String pass = "Ayush";
		
		Connection connection = DriverManager.getConnection(url, username, pass);
		
//		PreparedStatement ps = connection.prepareStatement("update actor set first_name=? where actor_id = ?");
//		ps.setString(1, "Ayushhh");
//		ps.setInt(2, 201);
		
		
		PreparedStatement ps = connection.prepareStatement("delete from actor where first_name='Ayushhh'");
		
		
//		ResultSet rs = ps.executeQuery();
//		
//		while(rs.next()) {
//			int id= rs.getInt(1);
//			String first_name= rs.getString(2);
//			String last_name = rs.getString(3);
//			
//			System.out.println("actor_id->"+ id +", actor_name ->"+ first_name+ ", last_name->"+ last_name);
//		}
		
		int count= ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Your db has been upated now");
		}
		
	}

}
