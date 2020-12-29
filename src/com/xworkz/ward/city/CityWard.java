package com.xworkz.ward.city;
import com.xworkz.ward.constants.WardName;
import com.xworkz.ward.dto.CityWardDTO;

public class CityWard {
	private CityWardDTO[] dto;
	int currentIndex = 0;

	public CityWard(int size) {
		this.dto = new CityWardDTO[size];
	}

	public void addWards(CityWardDTO cityDTO) {
		if (dto != null && this.currentIndex < this.dto.length) {
			int wardNo = cityDTO.getWardNo();
			WardName wardName = cityDTO.getWardName();
			String corporatorName = cityDTO.getCorporatorName();
			int population = cityDTO.getPopulation();
			String area = cityDTO.getArea();
			if (wardNo > 0 && wardName != null && corporatorName != null && population > 5000 && area != null) {
				System.out.println("You can add the ward");
				System.out.println("Current Index is " + this.currentIndex);
				dto[currentIndex] = cityDTO;
				currentIndex++;
			} else {
				System.out.println("Population is less you can not ward");
			}
		}
	}

	public void searchByNameAndNumber(WardName name, int wardNo) {
		if (name != null) {
			boolean start = false;
			if (dto != null) {
				for (int k = 0; k < this.dto.length; k++) {
					CityWardDTO cityWardDTO = this.dto[k];
					WardName wardName = cityWardDTO.getWardName();
					int number = cityWardDTO.getWardNo();
					if (name.equals(wardName) || wardNo == number) {
						start = true;
						System.out.println("Ward name is :" + cityWardDTO.getWardName());
						System.out.println(cityWardDTO.getWardNo());
						System.out.println(cityWardDTO.getCorporatorName());
						System.out.println(cityWardDTO.getPopulation());
						System.out.println(cityWardDTO.getArea());
						break;
					} else {
						System.out.println("Ward not found");
					}
				}
				if (start == false) {
					System.out.println("Ward Name is not found");
				}
			}
		}
	}

	public void displayWardDetails() {
		for (int i = 0; i < this.dto.length; i++) {
			CityWardDTO dto = this.dto[i];
			if (dto != null) {
				System.out.println(dto.getWardNo());
				System.out.println(dto.getWardName());
				System.out.println(dto.getCorporatorName());
				System.out.println(dto.getPopulation());
				System.out.println(dto.getArea());
			}
		}
	}
}
