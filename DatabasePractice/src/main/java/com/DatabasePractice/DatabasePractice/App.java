package com.DatabasePractice.DatabasePractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String url = "jdbc:mysql://localhost:3306/ecom";
    	String username = "root";
    	String pass = "Ayush";
    	Connection connection = DriverManager.getConnection(url, username, pass);
    	
    	PreparedStatement ps = connection.prepareStatement("select * from products");
    	
    	ResultSet rs = ps.executeQuery();
    	
    	while(rs.next()) {
    		String product_name = rs.getString(2);
    		
    		System.out.println("Your product name is -> " + product_name);
    	}
    	
    	
    	
    	
    }
}
