package com.javasession.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.ems.model.EmployeeModel;
import com.javasession.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("employees/list")
	public List<EmployeeModel> getEmployees() {
		List<EmployeeModel> employeeList = employeeService.getEmployees();
		return employeeList;
	}

	@GetMapping("live/employees/list")
	public List<EmployeeModel> getEmployeesFromDatabase() {
		List<EmployeeModel> employeeList = employeeService.getEmployeesFromDatabase();
		return employeeList;
	}

	@PostMapping("employees/add")
	public List<EmployeeModel> addEmployees(@RequestBody EmployeeModel employeeModel) {
		List<EmployeeModel> employessList = employeeService.addEmployee(employeeModel);
		return employessList;
	}

}
