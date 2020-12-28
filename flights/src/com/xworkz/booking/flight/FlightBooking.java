package com.xworkz.booking.flight;

import com.xworkz.booking.constants.Company;
import com.xworkz.booking.dto.FlightBookingDTO;

public class FlightBooking {

	private FlightBookingDTO[] dto;
	private int currentIndex = 0;

	/**
	 * 
	 * @param size
	 */
	public FlightBooking(int size) {
		dto = new FlightBookingDTO[size];
	}

	/**
	 * 
	 * @param bookingDTO
	 */
	public void detailsOfFlightBooking(FlightBookingDTO bookingDTO) {
		if (bookingDTO != null && this.currentIndex < 6) {
			String code = bookingDTO.getFlightCode();
			Company company = bookingDTO.getCompany();
			String startPoint = bookingDTO.getStartingPoint();
			String destination = bookingDTO.getDestination();
			int totalSeats = bookingDTO.getTotalSeats();
			double businessClass = bookingDTO.getBusinessClassPrice();
			double economyClass = bookingDTO.getEconomyClassPrice();
			if (code != null && company != null && startPoint != null && destination != null && businessClass > 1000
					&& economyClass > 1500) {
				System.out.println("You can book the Tickets");
				System.out.println("Current Index size is " + this.currentIndex);
				dto[this.currentIndex] = bookingDTO;
				this.currentIndex++;
			} else {
				if (bookingDTO != null) {
					System.out.println("Sorry cannot book the flight" + this.currentIndex);
				}
				System.out.println(this.currentIndex);
			}
		}
	}

	/**
	 * 
	 * @param startingPoint
	 * @return startingPoint
	 */
	public void bookingAtStartingPoint(String startingPoint) {
		if (startingPoint != null) {
			boolean start = false;
			for (int m = 0; m <= this.dto.length; m++) {
				FlightBookingDTO flightdDTO = this.dto[m];
				String refer = flightdDTO.getStartingPoint();
				if (startingPoint.equals(refer)) {
					System.out.println("Start point is " + flightdDTO.getStartingPoint());
					System.out.println(flightdDTO.getFlightCode());
					System.out.println(flightdDTO.getDestination());
					System.out.println(flightdDTO.getTotalSeats());
					System.out.println(flightdDTO.getCompany());
					System.out.println(flightdDTO.getEconomyClassPrice());
					System.out.println(flightdDTO.getBusinessClassPrice());
					start = true;
					break;
				}else {
					System.out.println("Staring point is not found");
				}
			}
			if (start == false) {
				System.out.println("Starting point is not found");
			}
		}
	}

	/**
	 * display the details of flights
	 */
	public void displayBooking() {
		for (int i = 0; i < this.dto.length; i++) {
			FlightBookingDTO dto = this.dto[i];
			if (dto != null) { 
				System.out.println(dto.getFlightCode());
				System.out.println(dto.getStartingPoint());
				System.out.println(dto.getDestination());
				System.out.println(dto.getTotalSeats());
				System.out.println(dto.getBusinessClassPrice());
				System.out.println(dto.getEconomyClassPrice());
				break;
			}
		}
	}
}