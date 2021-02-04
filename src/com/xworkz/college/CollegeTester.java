package com.xworkz.college;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.college.constants.Departments;
import com.xworkz.college.dao.CollegeDAO;
import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

public class CollegeTester {

	public static void main(String[] args) {
		
		List<CollegeDTO> list=new ArrayList<CollegeDTO>();
		
		CollegeDAO collegeDAO=new CollegeDAOImpl(list);
		
		CollegeService service=new CollegeServiceImpl(collegeDAO);
		
		CollegeDTO dto=new CollegeDTO("SKSVMACET", "VTU" ,"GADAG",125,80,Departments.ISE);
		
		collegeDAO.addCollege(dto);
		
		CollegeDTO dto2=new CollegeDTO("SJCIT", "VTU", "Chikkaballapur", 350, 230, Departments.ECE);
		collegeDAO.addCollege(dto2);
		
		int lenghtOfList=list.size();
	    System.out.println(lenghtOfList);
	    
	    System.out.println("************************");
	    
	    collegeDAO.updateNoofTeachingAndNonTeachingStaffsByName("SJCIT", 650, 30);
	    
	    System.out.println("-------------------------");
			
	    collegeDAO.deleteCollege("SKSVMACET");
	    
	    System.out.println(list.size());

	}

}
