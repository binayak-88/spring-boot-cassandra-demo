/**
 * 
 */
package com.cassandra.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.demo.keyspace.Employee;
import com.cassandra.demo.model.CreateEmployeeRequest;
import com.cassandra.demo.repository.EmployeeRepository;

/**
 * @author HP
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired Employee employee;
	@Override
	public String createEmployee(CreateEmployeeRequest createEmployeeRequest) {
		employee.setName(createEmployeeRequest.getName());
		employee.setDescription(createEmployeeRequest.getDescription());
		
		if(employeeRepository.save(employee)!=null){
			return "SUCCESS";
		}
		else {
			return "FAILED";
		}
		
	}

}
