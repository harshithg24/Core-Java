package com.xworkz.bank_server_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchQuery {
	
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
		
		String query = "SELECT * FROM BANK WHERE BRANCH = ?";
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DriverManager.getConnection(url,userName,password);
			ps = connection.prepareStatement(query);
			ps.setString(1, "Axis");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
