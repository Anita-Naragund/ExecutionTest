package com.xworkz.food.dto;

public class HotelDTO {
	private String[] hotelName= {"Shanti sagar","Biriyani House","Udupi hotel","kamath"};
	
	private final String[] location = {"Rajajinagar","JayaNagar","Mejestic","VijayNagar"};
	
	private String[] ownerName= {"Ahwini","Raju Patil","VijayKumar","Vinod"};
	
	public String[] getHotelName() {
		return hotelName;
	}
	public String[] getLocation() {
		return location;
	}
	public String[] getOwnerName() {
		return ownerName;
	}
}
