package com.xworkz.college.service;

import java.util.Iterator;

import com.xworkz.college.constants.Departments;
import com.xworkz.college.dao.CollegeDAO;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeServiceImpl implements CollegeService {
	
	private CollegeDAO dao;
	private Object collegeDAO;
	
	public CollegeServiceImpl(CollegeDAO dao) {
		System.out.println("Created CollegeServiceImpl");
		this.dao=dao;
	}

	@Override
	public boolean validateAndAddCollege(CollegeDTO dto) {
		System.out.println("Invoking validateAndAddCollege");
		boolean validate = false;
		if (dto != null) {
			System.out.println("dto is not null,can save fields");
			String name = dto.getCollegeName();
			if (name != null && !name.isEmpty() && !name.contains(" ") ) {
				System.out.println("name is valid");
				validate = true;
			} else {
				System.out.println("name is not valid");
				validate = false;
			}
			if (validate) {
				String university = dto.getUniversity();
				if (name != null && !name.isEmpty() && !name.contains(" ")) {
					System.out.println("university is valid");
					validate = true;
				} else {
					System.out.println("university is  not valid");
					validate = false;
				}
			}
			if (validate) {
				String location = dto.getLocation();
				if (location != null && !location.isEmpty() && !location.contains(" ")) {
					System.out.println("location is valid");
					validate = true;
				} else {
					System.out.println("location is not valid");
					validate = false;
				}
			}
			if (validate) {
				int teachingStaff = dto.getNoOfTeachingStaff();
				if (teachingStaff >= 10 && teachingStaff <= 350) {
					System.out.println("teachingStaff is valid");
					validate = true;
				} else {
					System.out.println("teachingStaff is invalid");
					validate = false;
				}
			}
			if (validate) {
				int nonTeachingStaff = dto.getNoOfNonTeachingStaff();
				if (nonTeachingStaff >=15 && nonTeachingStaff <= 300) {
					System.out.println("nonTeachingStaff is valid");
					validate = true;
				} else {
					System.out.println("nonTeachingStaff is not valid");
					validate = false;
				}
			}
			if (validate) {
				Departments department = dto.getDepartments();
				if (department!=null) {
					System.out.println("department is valid");
					validate = true;
				} else {
					System.out.println("department is not valid");
					validate = false;
				}
			}
			
			
			if (validate) {
				System.out.println("All data is valid,you can add the fields");
				this.dao. addCollege(dto);
			}
		} else {
			System.out.println("dto is null,you can not save fields");
		}
		return false;

}


	@Override
	public boolean validateAndUpdateNoofTeachingAndNonTeachingStaffsByName(String collegeName, int noOfTeachingStaff,
			int noOfNonTeachingStaff) {
		System.out.println("invoked validateAndUpdateNoofTeachingAndNonTeachingStaffsByName");
		if(collegeName!=null && !collegeName.contains(" ") && !collegeName.isEmpty() && noOfTeachingStaff >= 10 && noOfTeachingStaff <= 350 && noOfNonTeachingStaff >=15 && noOfNonTeachingStaff <= 300) {
			this.dao.updateNoofTeachingAndNonTeachingStaffsByName(collegeName, noOfTeachingStaff, noOfNonTeachingStaff);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCollege(String collegeName) {
		
		return false;
	}
	}