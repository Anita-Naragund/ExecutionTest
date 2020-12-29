package com.xworkz.ward.dto;

import com.xworkz.ward.constants.WardName;

public class CityWardDTO {
	private int wardNo;
	private WardName wardName;
	private String corporatorName;
	private int population;
	private String area;
	
	public CityWardDTO() {
		System.out.println("Invoked cityward");
	}

	public CityWardDTO(int wardNo, WardName wardName, String corporatorName, int population, String area) {
		super();
		this.wardNo = wardNo;
		this.wardName = wardName;
		this.corporatorName = corporatorName;
		this.population = population;
		this.area = area;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public String getCorporatorName() {
		return corporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
