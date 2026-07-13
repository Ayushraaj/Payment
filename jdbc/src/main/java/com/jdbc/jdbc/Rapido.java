package com.jdbc.jdbc;

import java.sql.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Rapido {

	private static final Logger LOGGER = LogManager.getLogger(Rapido.class);

    public static void createRide(PreparedStatement ps) throws SQLException {
        ps.setString(1, "Anish");
        ps.setString(2, "Banglore");
        ps.setString(3, "Rider1");
        ps.setString(4, "Active");
        ps.setString(5, "Goa");

        int count = ps.executeUpdate();
        if (count > 0) {
        	LOGGER.trace("Rider created successfully");
        }
    }

    
    public static void showRides(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("customer_name") +
                    ", Destination: " + rs.getString("destination") +
                    ", Rider: " + rs.getString("rider_name") +
                    ", Status: " + rs.getString("status") +
                    ", Pickup: " + rs.getString("pick_up_location")
            );
        }
    }

 
    public static void updateRide(PreparedStatement ps) throws SQLException {
        ps.setString(1, "Completeddddddddd");
        ps.setInt(2, 1);

        int count = ps.executeUpdate();
        if (count > 0) {
        	LOGGER.trace("Ride Updated Successfully");
        }
    }

 
    public static void deleteRide(PreparedStatement ps) throws SQLException {
        ps.setString(1, "In-active");
        ps.setInt(2,  1);

        int count = ps.executeUpdate();
        if (count > 0) {
        	LOGGER.trace("Ride Deleted Successfully");
        }
    }

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                DBDetails.URL, DBDetails.USERNAME, DBDetails.PASS);

        
//        PreparedStatement insertPS = con.prepareStatement(DBDetails.INSERT_RIDE);
//        createRide(insertPS);
        
//      
//        PreparedStatement readPS = con.prepareStatement(DBDetails.SHOW_RIDE);
//        showRides(readPS);
//
//   
        PreparedStatement updatePS = con.prepareStatement(DBDetails.UPDATE_RIDE);
        updateRide(updatePS);
//
//      
//        PreparedStatement deletePS = con.prepareStatement(DBDetails.DELETE_RIDE);
//        deleteRide(deletePS);

    }
}