package com.jdbc.jdbc;

import java.sql.*;


// without rollback and trans mechanism

public class Trans {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection connection = null;

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/transaction";
		String username = "root";
		String pass = "Ayush";
		
		connection = DriverManager.getConnection(url, username, pass);
		
		// getting the bal of userid = 123
		PreparedStatement ps1 = connection.prepareStatement("select amount from trans where user_id = ?");
		ps1.setInt(1, 123);
		
		ResultSet rs = ps1.executeQuery();
		
		int balance = 0;
		
		while(rs.next()) {
			balance = rs.getInt(1);
		}
		
		// balance of the user123
		System.out.println("Balance of the user123(deb) is -> " + balance);
		
		
		// getting the balace of user 456
		
		PreparedStatement ps3 = connection.prepareStatement("select amount from trans where user_id =?");
		ps3.setInt(1, 456);
		
		ResultSet rs1 = ps3.executeQuery();
		int amount456 =0;
		
		while(rs1.next()) {
			amount456 = rs1.getInt(1);
		}
		
		System.out.println("The balance of user456(cred) is -> "+ amount456);
		
		
		
		
		
		
		
		// update the balance in userid 456
		
		PreparedStatement ps2 = connection.prepareStatement("update trans set amount=? where user_id = ?");
		int deb_amount = 100;
		int new_amount = deb_amount+amount456;
		
		ps2.setInt(1, amount456+deb_amount);
		ps2.setInt(2, 456);
		
		int count = ps2.executeUpdate();
		if(count>0) {
			System.out.println("(Credit) Amount of user456 is updated from "+amount456 + " to " + new_amount);
		}
		
		// update the balance in user123
		
		PreparedStatement ps4=connection.prepareStatement("update trans set amount=? where user_id = ?");
		int new_bal = balance-deb_amount;
		ps4.setInt(1, balance-deb_amount );
		ps4.setInt(2, 123);
		
		int count1 = ps4.executeUpdate();
		if(count1>0) {
			System.out.println("(Deb)Amount of user123 is updated from "+balance + " to " + new_bal);
		}
		
		
		
		
		
		
		
		
	}

}
