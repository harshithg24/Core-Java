package bank_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteRecord {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbcurl = "jdbc:mysql://localhost:3306/mysql_store";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		String query = "DELETE FROM BANK WHERE Branch = 'SBI'";
		Connection connection1 = null;
		Statement statement1 = null;
		try {
			Connection connection = DriverManager.getConnection(jdbcurl,userName,password);
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				connection1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				statement1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
