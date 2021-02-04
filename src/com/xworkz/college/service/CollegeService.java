package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeService {

	boolean validateAndAddCollege(CollegeDTO dto);

	boolean validateAndUpdateNoofTeachingAndNonTeachingStaffsByName(String collegeName, int noOfTeachingStaff,
			int noOfNonTeachingStaff);
	
	boolean deleteCollege(String collegeName);

}
