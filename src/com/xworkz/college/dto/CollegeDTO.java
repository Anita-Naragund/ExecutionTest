package com.xworkz.college.dto;

import com.xworkz.college.constants.Departments;

public class CollegeDTO {

	private String collegeName;
	private String university;
	private String location;
	private int noOfTeachingStaff;
	private int noOfNonTeachingStaff;
	private Departments departments;

	public CollegeDTO() {
		System.out.println("Created CollegeDTO");
	}

	public CollegeDTO(String collegeName, String university, String location, int noOfTeachingStaff,
			int noOfNonTeachingStaff, Departments departments) {
		super();
		this.collegeName = collegeName;
		this.university = university;
		this.location = location;
		this.noOfTeachingStaff = noOfTeachingStaff;
		this.noOfNonTeachingStaff = noOfNonTeachingStaff;
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "CollegeDTO [collegeName=" + collegeName + ", university=" + university + ", location=" + location
				+ ", noOfTeachingStaff=" + noOfTeachingStaff + ", noOfNonTeachingStaff=" + noOfNonTeachingStaff
				+ ", departments=" + departments + "]";
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTeachingStaff() {
		return noOfTeachingStaff;
	}

	public void setNoOfTeachingStaff(int noOfTeachingStaff) {
		this.noOfTeachingStaff = noOfTeachingStaff;
	}

	public int getNoOfNonTeachingStaff() {
		return noOfNonTeachingStaff;
	}

	public void setNoOfNonTeachingStaff(int noOfNonTeachingStaff) {
		this.noOfNonTeachingStaff = noOfNonTeachingStaff;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

}
