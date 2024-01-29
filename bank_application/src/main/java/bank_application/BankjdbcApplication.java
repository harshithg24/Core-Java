package bank_application;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BankjdbcApplication {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		String jdbcurl = "jdbc:mysql://localhost:3306/bank_application";
		String userName = "root1";
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
		
		//String updateQuery1 = "UPDATE BANK SET LOCATION = 'Korlar' WHERE BRANCH = 'Axis'";
		//String updateQuery2 = "UPDATE BANK SET LOCATION = 'Nagasandra' WHERE BRANCH = 'SBI'";
		//String updateQuery3 = "UPDATE BANK SET LOCATION = 'Banashankari' WHERE BRANCH = 'Kotak'";
		//String updateQuery4 = "UPDATE BANK SET LOCATION = 'Vijayanagar' WHERE BRANCH = 'PNB'";
		//String updateQuery5 = "UPDATE BANK SET LOCATION = 'Attiguppe' WHERE BRANCH = 'Canara'";
		//String updateQuery6 = "UPDATE BANK SET LOCATION = 'Chikkbanavara' WHERE BRANCH = 'Union bank'";
		//String updateQuery7 = "UPDATE BANK SET LOCATION = 'Hebbala' WHERE BRANCH = 'IDBI'";
		//String updateQuery8 = "UPDATE BANK SET LOCATION = 'Yeshwanthpura' WHERE BRANCH = 'BoB'";
		
		
		
		
		try {
			Connection connection = DriverManager.getConnection(jdbcurl,userName,password);
			System.out.println("connectin successfull");
		    Statement statement = connection.createStatement();
		    boolean result = statement.execute(insertQuery);  //executeUpdate()
		   //int result1 = statement.executeUpdate(updateQuery);  //executeUpdate()
		    int result2 = statement.executeUpdate(insertQuery1);  //executeUpdate()
		    int result3 = statement.executeUpdate(insertQuery2);  //executeUpdate()
		    int result4 = statement.executeUpdate(insertQuery3);  //executeUpdate()
		    int result5 = statement.executeUpdate(insertQuery4);  //executeUpdate()
		    int result6 = statement.executeUpdate(insertQuery5);  //executeUpdate()
		    int result7 = statement.executeUpdate(insertQuery6);  //executeUpdate()
		    int result8 = statement.executeUpdate(insertQuery7);  //executeUpdate()
		    int result9 = statement.executeUpdate(insertQuery8);  //executeUpdate()
		    
		    //int result10 = statement.executeUpdate(updateQuery1);  
		    //int result11 = statement.executeUpdate(updateQuery2);  
		    //int result12 = statement.executeUpdate(updateQuery3);  
		    //int result13 = statement.executeUpdate(updateQuery4);  
		    //int result14 = statement.executeUpdate(updateQuery5);  
		    //int result15 = statement.executeUpdate(updateQuery6);  
		    //int result16 = statement.executeUpdate(updateQuery7);  
		    //int result17 = statement.executeUpdate(updateQuery8);  
		    
		   
			System.out.println("Inserted into data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
