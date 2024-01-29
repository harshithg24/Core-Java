package com.xworkz.bank_server_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateWithPreparedStatement {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/bank_application";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		String query = "UPDATE BANK SET LOCATION = ? WHERE BRANCH = ?";
		
		try {
			Connection connection = DriverManager.getConnection(url,userName,password);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, "Malleshwaram");
			ps.setString(2, "icici");
			ps.execute();
			ps.setString(1, "USA");
			ps.setString(2, "SBI");
			ps.addBatch();
			ps.setString(1, "Kerala");
			ps.setString(2, "Axis");
			ps.addBatch();
			ps.setString(1, "CHENNAI");
			ps.setString(2, "Kotak");
			ps.addBatch();
			ps.executeBatch();
			System.out.println("Update successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
