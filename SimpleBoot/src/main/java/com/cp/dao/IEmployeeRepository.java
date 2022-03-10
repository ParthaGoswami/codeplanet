package com.cp.dao;

import java.util.List;

import com.cp.model.Employee;

public interface IEmployeeRepository {
	
	public List<Employee> getAllEmployees();
	
	public void saveAllEmployees(Employee employee);

}
