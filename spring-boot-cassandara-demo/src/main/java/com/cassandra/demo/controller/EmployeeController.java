/**
 * 
 */
package com.cassandra.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.demo.model.CreateEmployeeRequest;
import com.cassandra.demo.model.CreateEmployeeResponse;
import com.cassandra.demo.service.EmployeeService;

/**
 * @author HP
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	CreateEmployeeResponse createEmployeeResponse;
	
	@PostMapping("/create")
	public ResponseEntity<CreateEmployeeResponse> cteateEmployee(@ModelAttribute CreateEmployeeRequest createEmployeeRequest) {
		String response = employeeService.createEmployee(createEmployeeRequest);		
		if(response.equals("SUCCESS")) {
			createEmployeeResponse.setResponse("SUCCESS");
			return new ResponseEntity<>(createEmployeeResponse,HttpStatus.OK);
		}
		else {
			createEmployeeResponse.setResponse("FAILED");
			return new ResponseEntity<>(createEmployeeResponse,HttpStatus.BAD_REQUEST);
		}
	}	
}