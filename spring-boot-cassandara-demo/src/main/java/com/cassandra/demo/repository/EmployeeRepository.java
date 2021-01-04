/**
 * 
 */
package com.cassandra.demo.repository;

import org.springframework.stereotype.Repository;

import com.cassandra.demo.keyspace.Employee;

import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * @author HP
 *
 */
@Repository
public interface EmployeeRepository extends CassandraRepository<Employee,String>{

}
