package com.EcomFinal.EcomFinal;

import java.sql.*;

public class Cart{ 

	public void AddToCart(int customerId, int productId, int qty) throws Exception {
	    Connection con = DBConnection.getConnection();
	
	    String query = "INSERT INTO cart(customer_id, product_id, quantity) VALUES(?,?,?)";
	
	    PreparedStatement ps = con.prepareStatement(query);
	    ps.setInt(1, customerId);
	    ps.setInt(2, productId);
	    ps.setInt(3, qty);
	
	    ps.executeUpdate();
	
	    System.out.println("Added to cart");
	    
	}
}