package com.cp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.dao.EmployeeRepository;
import com.cp.dao.IEmployeeRepository;
import com.cp.model.Employee;

@Service
public class EmployeeService {
	
	
	private IEmployeeRepository jdbcEmployeeRepository;
	
	
	public EmployeeService(IEmployeeRepository jdbcEmployeeRepository) {		
		this.jdbcEmployeeRepository = jdbcEmployeeRepository;
	}
	
	public List<Employee> getEmployeeDetails() {
		
		return jdbcEmployeeRepository.getAllEmployees();
	}

}
