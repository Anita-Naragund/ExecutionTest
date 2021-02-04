package com.xworkz.college.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.college.dto.CollegeDTO;

public class CollegeDAOImpl implements CollegeDAO {

	List<CollegeDTO> collegeDAO;

	public CollegeDAOImpl(List<CollegeDTO> dto) {
		this.collegeDAO = dto;
	}

	@Override
	public boolean addCollege(CollegeDTO dto) {
		System.out.println("invoked addCollege");
		boolean added = false;
		if (!this.collegeDAO.contains(dto)) {
			added = this.collegeDAO.add(dto);
		}
		if (added) {
			System.out.println("College is added to list ");
			System.out.println(collegeDAO);
			return true;
		} else {
			System.out.println("College is not added to list");
		}
		return false;
	}

	@Override
	public boolean updateNoofTeachingAndNonTeachingStaffsByName(String collegeName, int noOfTeachingStaff,
			int noOfNonTeachingStaff) {
		System.out.println("invoked updateNoofTeachingAndNonTeachingStaffsByName");
		for (CollegeDTO collegeDTO : collegeDAO) {
			String nameOfclg = collegeDTO.getCollegeName();
			if (nameOfclg != null && nameOfclg.contains(collegeName)) {
				System.out.println("College name is found,you can update the details");
				collegeDTO.setNoOfNonTeachingStaff(noOfNonTeachingStaff);
				collegeDTO.setNoOfTeachingStaff(noOfTeachingStaff);
				System.out.println("After updating :" + collegeDTO);
				
				System.out.println(collegeDTO.getNoOfNonTeachingStaff());
				System.out.println(collegeDTO.getNoOfTeachingStaff());
				return true;
			} else {
				System.out.println("College is not found");
				// return false;
			}
		}
		System.out.println("list is not found");
		return false;
	}

	@Override
	public boolean deleteCollege(String collegeName) {
		System.out.println("invoked deleteCollege");
		Iterator<CollegeDTO> iterator = this.collegeDAO.iterator();
		while (iterator.hasNext()) {
			CollegeDTO found = iterator.next();
			if (found.getCollegeName().equals(collegeName)) {
				collegeDAO.remove(found);

			}
		}
		return false;
	}

}
