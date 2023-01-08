package com.javasession.ems.service;

import java.util.List;

import com.javasession.ems.model.EmployeeModel;


public interface EmployeeService {
	// for retrieving the list of employees
	public List<EmployeeModel> getEmployees();

	// for adding the employees to the system
	public List<EmployeeModel> addEmployee(EmployeeModel employeeModel);
	
	public List<EmployeeModel> getEmployeesFromDatabase();

}
