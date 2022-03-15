package com.cp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.SimpleRunException;
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
		
		List<Employee> employees = jdbcEmployeeRepository.getAllEmployees();
		System.out.println("Empty List encointered : " + employees);
		if(employees == null || employees.isEmpty()) {
			
			throw new SimpleRunException("Error occured in retrieval");
		}
		return employees;
	}

}
