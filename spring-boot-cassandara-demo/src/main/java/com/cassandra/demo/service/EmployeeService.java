/**
 * 
 */
package com.cassandra.demo.service;

import com.cassandra.demo.model.CreateEmployeeRequest;
import com.cassandra.demo.model.CreateEmployeeResponse;

/**
 * @author HP
 *
 */
public interface EmployeeService {
	public String createEmployee(CreateEmployeeRequest createEmployeeRequest);
}
