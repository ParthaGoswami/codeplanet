package com.cp.clg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.clg.model.College;
import com.cp.clg.repository.ICollegeRepository;

@Service
public class CollegeService implements ICollegeService{
	
	@Autowired
	private ICollegeRepository collegeRepository;

	@Override
	public List<College> getAllColleges() {
		
		return collegeRepository.getColleges();
	}

	@Override
	public Boolean addCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

}
