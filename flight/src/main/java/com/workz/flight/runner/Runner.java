package com.workz.flight.runner;

import com.workz.flight.dto.FlightBooking;
import com.workz.flight.repository.FlightBookingRepository;
import com.workz.flight.repository.FlightBookingRepositoryImpl;

public class Runner {
	
	public static void main(String[] args) {
		
		FlightBookingRepository flightBookingRep = new FlightBookingRepositoryImpl();
		
		
		FlightBooking flight = new FlightBooking(1, "AirIndia", "Goa", "Bengaluru", 5000);
		
		flightBookingRep.saveFlightBookingDetails(flight);
		
		
		
	}
}
