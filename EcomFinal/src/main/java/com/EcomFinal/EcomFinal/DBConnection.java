package com.EcomFinal.EcomFinal;




import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Ecom",
                    "root",
                    "Ayush"
            );
        } catch (Exception e) {
            
        	System.out.println(e);
        }
        return con;
    }
}