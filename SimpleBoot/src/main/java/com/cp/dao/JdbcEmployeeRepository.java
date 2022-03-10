package com.cp.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.model.Employee;

@Repository
public class JdbcEmployeeRepository implements IEmployeeRepository{

	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcEmployeeRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> getAllEmployees() {

		return jdbcTemplate.query("select * from employee", 
				(rs, rnum) -> {
					Employee employee =  new Employee();
					employee.setName(rs.getString("name"));
					return employee;
				});	
	}

	@Override
	public void saveAllEmployees(Employee employee) {

		jdbcTemplate.update("insert into employee (name , age) values ( ?, ?)" ,
						employee.getName() , employee.getAge());
		
	}

}
