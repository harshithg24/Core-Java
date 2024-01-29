package com.workz.flight.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.workz.flight.dto.FlightBooking;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{

	public void saveFlightBookingDetails(FlightBooking booking) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ticketsystem";
		String userName = "root";
		String password = "Xworkzodc@123";
		
		String query = "INSERT into AIRTICKET(flightname,sources,destination,price) VALUES(?,?,?,?)";
		
		try {
			Connection connection = DriverManager.getConnection(url,userName,password);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1,booking.getFlightName());
			ps.setString(2,booking.getSource());
			ps.setString(3,booking.getDestination());
			ps.setInt(4,booking.getPrice());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
