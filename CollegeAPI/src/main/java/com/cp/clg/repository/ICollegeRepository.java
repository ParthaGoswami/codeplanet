package com.cp.clg.repository;

import java.util.List;

import com.cp.clg.model.College;

public interface ICollegeRepository {

	public List<College> getColleges();
	
	public Integer saveCollege(College college);
}
