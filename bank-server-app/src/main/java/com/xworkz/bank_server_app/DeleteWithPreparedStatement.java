package com.xworkz.bank_server_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteWithPreparedStatement {
	
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
		
		String query = "DELETE FROM BANK WHERE BRANCH = ?";
		
		try {
			Connection connection = DriverManager.getConnection(url,userName,password);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, "icici");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
