package com.cp.clg.service;

import java.util.List;

import com.cp.clg.model.College;

public interface ICollegeService {
	
	public List<College> getAllColleges();
	
	public Boolean addCollege(College college);

}
