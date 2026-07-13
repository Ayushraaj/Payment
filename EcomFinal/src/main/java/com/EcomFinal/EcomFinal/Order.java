package com.EcomFinal.EcomFinal;



import java.sql.*;

public class Order {

    public void placeOrder(int customerId) throws Exception {

        Connection con = DBConnection.getConnection();

        try {
            con.setAutoCommit(false); 

           
            String orderQuery = "INSERT INTO orders(customer_id) VALUES(?)";
            PreparedStatement orderPs = con.prepareStatement(orderQuery);
            orderPs.setInt(1, customerId);
            orderPs.executeUpdate();

  
            String getIdQuery = "SELECT MAX(order_id) FROM orders";
            PreparedStatement getIdPs = con.prepareStatement(getIdQuery);
            ResultSet rs = getIdPs.executeQuery();

            rs.next();
            int orderId = rs.getInt(1);

            
            String cartQuery = "SELECT * FROM cart WHERE customer_id=?";
            PreparedStatement cartPs = con.prepareStatement(cartQuery);
            cartPs.setInt(1, customerId);
            ResultSet cartRs = cartPs.executeQuery();

            while (cartRs.next()) {

                int productId = cartRs.getInt("product_id");
                int qty = cartRs.getInt("quantity");

               
                String stockQuery = "SELECT stock FROM products WHERE product_id=?";
                PreparedStatement stockPs = con.prepareStatement(stockQuery);
                stockPs.setInt(1, productId);

                ResultSet stockRs = stockPs.executeQuery();
                stockRs.next();
                int stock = stockRs.getInt("stock");

                
                if (stock < qty) {
                    throw new Exception("Stock not enough for product " + productId);
                }

                
                String itemQuery = "INSERT INTO order_items(order_id, product_id, quantity) VALUES(?,?,?)";
                PreparedStatement itemPs = con.prepareStatement(itemQuery);
                itemPs.setInt(1, orderId);
                itemPs.setInt(2, productId);
                itemPs.setInt(3, qty);
                itemPs.executeUpdate();

                
                String updateQuery = "UPDATE products SET stock = stock - ? WHERE product_id=?";
                PreparedStatement updatePs = con.prepareStatement(updateQuery);
                updatePs.setInt(1, qty);
                updatePs.setInt(2, productId);
                updatePs.executeUpdate();
            }

            
            
            String deleteCart = "DELETE FROM cart WHERE customer_id=?";
            PreparedStatement deletePs = con.prepareStatement(deleteCart);
            deletePs.setInt(1, customerId);
            deletePs.executeUpdate();

           
            con.commit();
            System.out.println("Order placed successfully");

        } catch (Exception e) {

            
            con.rollback();
            System.out.println("Transaction failed"+ e);

        } 
    }
}