package com.xworkz.college.dao;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeDAO {
	
	boolean addCollege(CollegeDTO dto);
	
	boolean updateNoofTeachingAndNonTeachingStaffsByName(String collegeName,int noOfTeachingStaff,int noOfNonTeachingStaff);
	
	boolean deleteCollege(String collegeName);

}
