package com.cp.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cp.SimpleRunException;
import com.cp.model.Employee;
import com.cp.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class EmployeeController {
	
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {		
		this.employeeService = employeeService;
	}
	
	
	@Operation(summary = "Get a book by its id")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", description = "Found the Employee", 
	    content = { @Content(mediaType = "application/json")} ),
	  @ApiResponse(responseCode = "400", description = "Invalid id supplied", 
	    content = @Content), 
	  @ApiResponse(responseCode = "404", description = "Employee not found", 
	    content = @Content) })
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmployee() {		
//		Employee employee = employeeService.getEmployeeDetails();				
		return ResponseEntity.ok(employeeService.getEmployeeDetails());
	}
	
	
	
//	@ExceptionHandler({ SimpleRunException.class })
//    public ResponseEntity<Void> handleException(SimpleRunException ex) {
//        System.out.println("Error Handled .." + ex);
//        return ResponseEntity.badRequest().build();
//    }

}
