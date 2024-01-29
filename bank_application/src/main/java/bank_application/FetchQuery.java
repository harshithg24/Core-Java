package bank_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchQuery {
	
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
		
		String query = "SELECT * FROM BANK";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcurl,userName,password);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);	
			if(result.next()) {
				System.out.println(result.toString());
				System.out.println(result.getString("Branch"));
				System.out.println(result.getString("ifsc"));
				System.out.println(result.getString("location"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
}

}
