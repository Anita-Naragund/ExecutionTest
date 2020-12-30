package com.xworkz.food;
import com.xworkz.food.constants.Location;
import com.xworkz.food.dto.HotelDTO;
import com.xworkz.food.hotel.Hotel;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] foodItems= {"Dosa","idli"," veg Biriyani","Gobimanchuri","Pani puri"};
		HotelDTO hotelDTO=new HotelDTO("Ayodya",Location.HUBLI, "Anu", "veg", true, foodItems);
		Hotel hotelOperation=new Hotel();
		hotelOperation.acceptInformation(hotelDTO);
		hotelOperation.displayInfo();
		
		HotelDTO hotelDTO1=new HotelDTO("pingar",Location.HUBLI, "Aishwarya", "veg", true, foodItems);
		Hotel hotelOperation1=new Hotel();
		hotelOperation1.acceptInformation(hotelDTO1);
		hotelOperation1.displayInfo();
		
		HotelDTO hotelDTO2=new HotelDTO("Durga",Location.HAVERI, "Vishalaxi", "non veg", false, foodItems);
		Hotel hotelOperation2=new Hotel();
		hotelOperation2.acceptInformation(hotelDTO2);
		hotelOperation2.displayInfo();
		
		hotelOperation1.returnOwnerName("pingar");
		hotelOperation1.serachHotel(Location.HUBLI,"pingar");
}
}
