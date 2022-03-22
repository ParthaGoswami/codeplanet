package com.cp.clg.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.clg.model.College;
import com.cp.clg.rowmapper.CollegeRowMapper;

@Repository
public class CollegeRepositoryImpl implements ICollegeRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CollegeRowMapper collgeRowMapper;

	
	@Override
	public List<College> getColleges() {
		// TODO Auto-generated method stub		
		return  jdbcTemplate.query("select * from college;" , collgeRowMapper);
	}

	@Override
	public Integer saveCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

}
