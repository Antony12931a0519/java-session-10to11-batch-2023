package com.javasession.ems.service;

import java.util.List;

import com.javasession.ems.model.Employee;


public interface EmployeeService {
	// for retrieving the list of employees
	public List<Employee> getEmployees();

	// for adding the employees to the system
	public List<Employee> addEmployee(Employee employee);

}
