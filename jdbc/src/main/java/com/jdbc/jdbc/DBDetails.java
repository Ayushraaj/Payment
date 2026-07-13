package com.jdbc.jdbc;

public class DBDetails  {
    
    public static final String URL = "jdbc:mysql://localhost:3306/rapido";
    public static final String USERNAME ="root";
    public static final String PASS ="Ayush";

 
    public static final String INSERT_RIDE =
        "INSERT INTO booking_ride (customer_name, destination, rider_name, status, pick_up_location) VALUES (?, ?, ?, ?, ?)";


    public static final String SHOW_RIDE =
        "SELECT * FROM booking_ride";

    public static final String UPDATE_RIDE =
        "UPDATE booking_ride SET status = ? WHERE id = ?";


    public static final String DELETE_RIDE =
    		"UPDATE booking_ride SET status = ? WHERE id = ?";
}