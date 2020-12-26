package com.xworkz.food;
import com.xworkz.food.hotel.Hotel;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel=new Hotel("Shanti Sagar","Ashwini");
		hotel.hotelFound("Shanti Sagar");
		hotel.bookFoodAndTotalPriceIs("Shanti sagar", "RajajiNagar", "Anita","Tanduri",3);
	}
}
