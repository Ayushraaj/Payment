package com.jdbc.jdbc;


import java.sql.*;






// write the wrong column name to get the rollback() senario





public class Trans1 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/transaction";
        String username = "root";
        String pass = "Ayush";

        Connection connection = DriverManager.getConnection(url, username, pass);

        //  Step 1: Auto commit OFF
        connection.setAutoCommit(false);

        try {

            // -------- Sender Balance --------
            PreparedStatement ps = connection.prepareStatement(
                    "select amount from trans where user_id = ?");
            ps.setInt(1, 123);

            ResultSet rs = ps.executeQuery();
            int sender_bal = 0;

            if (rs.next()) {
                sender_bal = rs.getInt(1);
            }

            // -------- Receiver Balance --------
            PreparedStatement ps1 = connection.prepareStatement(
                    "select amount from trans where user_id=?");
            ps1.setInt(1, 456);

            ResultSet rs2 = ps1.executeQuery();
            int receiver_bal = 0;

            if (rs2.next()) {
                receiver_bal = rs2.getInt(1);
            }

            int amount = 100;

            // -------- Sender Update --------
            PreparedStatement ps3 = connection.prepareStatement(
                    "update trans set amount=? where user_id=?");

            ps3.setInt(1, sender_bal - amount);
            ps3.setInt(2, 123);

            ps3.executeUpdate();

           

            // -------- Receiver Update --------
            PreparedStatement ps4 = connection.prepareStatement(
                    "update trans set amount=? where user_id=?");

            ps4.setInt(1, receiver_bal + amount);
            ps4.setInt(2, 456);

            ps4.executeUpdate();

            //  Step 2: Commit
            connection.commit();
            System.out.println("Transaction successful ");

        } catch (Exception e) {

            //step 3: rollback()
            connection.rollback();
            System.out.println("Transaction failed  → Rolled back");

        } finally {
            connection.close();
        }
    }
}
