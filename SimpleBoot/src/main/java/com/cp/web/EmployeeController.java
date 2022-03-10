package com.cp.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cp.model.Employee;
import com.cp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {		
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmployee() {		
//		Employee employee = employeeService.getEmployeeDetails();				
		return ResponseEntity.ok(employeeService.getEmployeeDetails());
	}

}
