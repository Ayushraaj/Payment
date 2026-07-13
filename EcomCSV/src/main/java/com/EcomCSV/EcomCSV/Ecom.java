package com.EcomCSV.EcomCSV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ecom {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/user";
		String username = "root";
		String pass = "Ayush";
		
		Connection connection = DriverManager.getConnection(url, username, pass);
		
		String productName = "key5";
		String description = "used to lock doors";
		int price = 200;
		int stock = 3;
		
		PreparedStatement ps = connection.prepareStatement(
		    "insert into products(product_name, description, price, stock_quantity) values(?,?,?,?)"
		);
		
		ps.setString(1, productName);
		ps.setString(2, description);
		ps.setInt(3, price);
		ps.setInt(4, stock);
		
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println("A new product is inserted Successfully");
			
			
			//writeToCSV(productName, description, price, stock);
		}
		ReadFile();
		
		connection.close();
	}

	
	
	public static void writeToCSV(String productName, String description, int price, int stock) {
		
//		String filePath = "C:/Users/ayush/eclipse-workspace/EcomCSV/src/product.csv"; 
		String filePath = "products.csv";
		
		try (FileWriter writer = new FileWriter(filePath, true)) {
			
			
			writer.append(productName).append(",");
			writer.append(description).append(",");
			writer.append(String.valueOf(price)).append(",");
			writer.append(String.valueOf(stock));
			writer.append("\n");
			
			System.out.println("Product saved to CSV successfully!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void ReadFile() throws IOException {
		String filePath = "products.csv";
		
		try(BufferedReader bufferReader = new BufferedReader(new FileReader(filePath)))
		
		{
			String current_line_reading;
			
			while((current_line_reading = bufferReader.readLine()) !=null) {
				
				String[] data = current_line_reading.split(",");
				String product_name = data[0];
				String description = data[1];
				int price = Integer.parseInt(data[2]);
				int stock = Integer.parseInt(data[3]);
				
				
				System.out.println("Product name is -> " + product_name);
			      System.out.println("Description -> "+ description);
			      System.out.println("Price of the product is -> "+ price);
			      System.out.println(" Stock of the product inside the db is ->" + stock);
				
			}
		}
		
		
	}
	
	
}