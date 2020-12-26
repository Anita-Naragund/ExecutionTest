package com.xworkz.food.hotel;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.xworkz.food.dto.HotelDTO;

public class Hotel {
	private String[] hotelName= {"Shanti sagar","Biriyani House","Udupi hotel","kamath"};
	private String ownerName;
	private String location = "RajajiNagar";
	private double price = 150;
	private String[] foodItems = { "Goobi", "Fride Rice", "Mashrum Manchuri", "Tanduri", "Veg Kadai", "Gobi Rice",
			"French frice", "Parata", "Kushka", "Paneer Tika" };

	public Hotel(String hotelName, String ownerName) {
		System.out.println("Create and Initialize Hotel*********************");
		System.out.println("args 0 " + hotelName);
		System.out.println("args 1 " + ownerName);
		this.ownerName = ownerName;
	}

	public boolean hotelFound(String hotelName)
	{
		for (int s = 0; s < this.hotelName.length; s++) {
			String hotel = this.hotelName[s];
			System.out.println("Comparing " + hotel + "with " + hotelName);
			if (hotelName.equals(hotel)) {
				System.out.println("Hotel is found");
				break;
			}else {
				System.out.println("hotel is not found");
			}
		}
		return false;
	}

	public double bookFoodAndTotalPriceIs(String hotelName, String location,String bookedBy,String foodItems,int quantity) {
			double totalPrice = 0;
			System.out.println("Invoked bookTickets");
			System.out.println("args 0 " +hotelName);
			System.out.println("args 1 " + location);
			System.out.println("args 3 " + bookedBy);
			if(this.hotelName!=null) {
			for (int t = 0; t < this.foodItems.length; t++) {
				String food = this.foodItems[t];
				System.out.println("Comparing " + food + "with " + foodItems);
				if (foodItems.equals(food)) {
					System.out.println("Food item is there you can order");
					totalPrice=quantity*price;
					System.out.println(totalPrice);
					break;
				}
				else {
					System.out.println("Cancel the order");
				}
			}
			}
			return totalPrice;
	}
}
