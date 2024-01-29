package com.xworkz.bank_server_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class BankApplication {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String jdbcurl = "jdbc:mysql://localhost:3306/bank_application";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		String insertQuery = "INSERT INTO bank VALUES(2,'icici','SBI0010','BTM')";
		String insertQuery1 = "INSERT INTO bank VALUES (3, 'Axis', 'SBI0012', 'Koramangala')";
		String insertQuery2= "INSERT INTO bank VALUES (4, 'SBI', 'SBI0013', 'MG Road')";
		String insertQuery3= "INSERT INTO bank VALUES (5, 'Kotak', 'SBI0014', 'Whitefield')";
		String insertQuery4 = "INSERT INTO bank VALUES (6, 'PNB', 'SBI0015', 'Indiranagar')";
		String insertQuery5 = "INSERT INTO bank VALUES (7, 'Canara', 'SBI0016', 'Electronic City')";
		String insertQuery6= "INSERT INTO bank VALUES (8, 'Union Bank', 'SBI0017', 'Marathahalli')";
		String insertQuery7= "INSERT INTO bank VALUES (9, 'IDBI', 'SBI0018', 'Yelahanka')";
		String insertQuery8= "INSERT INTO bank VALUES (10, 'BoB', 'SBI0019', 'Rajajinagar')";
		
		
		try {
			Connection connection = DriverManager.getConnection(jdbcurl,userName,password);
			System.out.println("Connection successful");
			Statement statement = connection.createStatement();
			int result1 = statement.executeUpdate(insertQuery); 
			int result2 = statement.executeUpdate(insertQuery1);  //executeUpdate()
		    int result3 = statement.executeUpdate(insertQuery2);  //executeUpdate()
		    int result4 = statement.executeUpdate(insertQuery3);  //executeUpdate()
		    int result5 = statement.executeUpdate(insertQuery4);  //executeUpdate()
		    int result6 = statement.executeUpdate(insertQuery5);  //executeUpdate()
		    int result7 = statement.executeUpdate(insertQuery6);  //executeUpdate()
		    int result8 = statement.executeUpdate(insertQuery7);  //executeUpdate()
		    int result9 = statement.executeUpdate(insertQuery8);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
