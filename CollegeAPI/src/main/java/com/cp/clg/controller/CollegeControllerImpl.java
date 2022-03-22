package com.cp.clg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cp.clg.model.College;
import com.cp.clg.service.ICollegeService;

@RestController
public class CollegeControllerImpl implements ICollegeController{
	
	@Autowired
	private ICollegeService collegeService;

	@Override
	@GetMapping("/college")
	public ResponseEntity<List<College>> getAllCollege() {
		List<College> collegeList = collegeService.getAllColleges();
		return ResponseEntity.ok(collegeList);
	}

	@PostMapping("/college")
	public ResponseEntity<Void> addCollege(College college) {
		
		return null;
	}
	
	

}
