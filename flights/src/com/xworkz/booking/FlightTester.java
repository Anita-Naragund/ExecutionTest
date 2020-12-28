package com.xworkz.booking;

import com.xworkz.booking.constants.Company;
import com.xworkz.booking.dto.FlightBookingDTO;
import com.xworkz.booking.flight.FlightBooking;

public class FlightTester {
	public static void main(String[] args) {
		FlightBooking booking=new FlightBooking(80);
		
		FlightBookingDTO bookingDTO=new FlightBookingDTO("INDIA587", Company.AIRINDIA, "Hubli", "Hydrabad", 4, false, 24000, 12000);
		booking.detailsOfFlightBooking(bookingDTO);
		booking.displayBooking();
		
		FlightBookingDTO bookingDTO1=new FlightBookingDTO("KING9876",Company.KINGFISHER,"Mysore","Dehli",9,true,12000,6200);
		booking.detailsOfFlightBooking(bookingDTO1);
		booking.displayBooking();
		
		FlightBookingDTO bookingDTO2=new FlightBookingDTO("AIR8966", Company.INDIGO, "Bengalore", "Singapore", 2, true, 52000, 29000);
		booking.detailsOfFlightBooking(bookingDTO2);
		booking.displayBooking();
		
		FlightBookingDTO bookingDTO3=new FlightBookingDTO("INDIA3688", Company.INDIANAIRWAYS, "Mumbai", "Ladak", 1, false, 63000, 54000);
		booking.detailsOfFlightBooking(bookingDTO3);
		booking.displayBooking();
		System.out.println("************");
		
		booking.bookingAtStartingPoint("goa");
	}
}
