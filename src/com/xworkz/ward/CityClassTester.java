package com.xworkz.ward;

import com.xworkz.ward.city.CityWard;
import com.xworkz.ward.constants.WardName;
import com.xworkz.ward.dto.CityWardDTO;

public class CityClassTester {

	public static void main(String[] args) {
		CityWard cityWard=new CityWard(10);
		CityWardDTO cityWardDTO=new CityWardDTO(5634, WardName.Devasandra, "Kavya", 6000, "350sf");
		cityWard.addWards(cityWardDTO);
		cityWard.displayWardDetails();
		cityWard.searchByNameAndNumber(WardName.Devasandra, 5634);
		
		CityWardDTO cityWardDTO1=new CityWardDTO(6986,WardName.Hebbala,"Anita",3000,"698sq");
		cityWard.addWards(cityWardDTO1);
		
		CityWardDTO cityWardDTO2=new CityWardDTO(6354,WardName.Jayamahal,"K N Patil",6820,"632sq");
		cityWard.addWards(cityWardDTO2);
		
		CityWardDTO cityWardDTO3=new CityWardDTO(8745,WardName.JPPark,"Vidya",4800,"854sq");
		cityWard.addWards(cityWardDTO3);
		
		CityWardDTO cityWardDTO4=new CityWardDTO(3521,WardName.Vignananagar,"Nikita",5200,"955sq");
		cityWard.addWards(cityWardDTO4);
		
		cityWard.displayWardDetails();
		cityWard.searchByNameAndNumber(WardName.Jayamahal, 8745);
		
		cityWard.searchByNameAndNumber(null,0);
	}
}
