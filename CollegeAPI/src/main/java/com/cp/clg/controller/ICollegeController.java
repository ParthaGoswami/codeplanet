package com.cp.clg.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cp.clg.model.College;

public interface ICollegeController {
	
	public ResponseEntity<List<College>> getAllCollege();
	
	public ResponseEntity<Void> addCollege(College college);

}
