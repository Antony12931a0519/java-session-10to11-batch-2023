package com.javasession.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.ems.model.Employee;
import com.javasession.ems.service.EmployeeService;
import com.javasession.ems.utility.EmployeeUtility;

@Service
public class EmployeeServceImpl implements EmployeeService {

	@Autowired
	private EmployeeUtility employeeUtility;

	@Override
	public List<Employee> getEmployees() {

		List<Employee> employeesList = employeeUtility.getEmployees();
		return employeesList;
	}

	@Override
	public List<Employee> addEmployee(Employee employee) {

		List<Employee> newEmployeesList = employeeUtility.addEmployee(employee);

		return newEmployeesList;
	}

}
