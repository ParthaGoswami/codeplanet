package com.cp.service;

import org.springframework.stereotype.Service;

import com.cp.dao.EmployeeRepository;
import com.cp.model.Employee;

@Service
public class EmployeeService {
	
	
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeService(EmployeeRepository employeeRepository) {		
		this.employeeRepository = employeeRepository;
	}
	
	public Employee getEmployeeDetails() {
		
		employeeRepository.getEmployeeDataFromDb();
		
		Employee employee =  new Employee();
		employee.setName("CodePlanet");
		employee.setAge(20);
		
		return employee;
	}

}
