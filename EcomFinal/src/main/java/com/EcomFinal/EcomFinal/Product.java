package com.EcomFinal.EcomFinal;



import java.sql.*;

public class Product {

    public void viewProducts() throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM products";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("product_id") + " " +
                    rs.getString("product_name") + " " +
                    rs.getDouble("price") + " " +
                    rs.getInt("stock")
            );
        }

        
    }
}