package com.javasession.bms.service;

import java.util.List;

import com.javasession.bms.model.EmployeeModel;


public interface EmployeeService {
	// for retrieving the list of employees
	public List<EmployeeModel> getEmployees();

	// for adding the employees to the system
	public List<EmployeeModel> addEmployee(EmployeeModel employeeModel);
	
	public List<EmployeeModel> getEmployeesFromDatabase();

}
