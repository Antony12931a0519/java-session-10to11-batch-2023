package com.javasession.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.ems.model.Employee;
import com.javasession.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("employees/list")
	public List<Employee> getEmployees() {
		List<Employee> employeeList = employeeService.getEmployees();
		return employeeList;
	}

	@PostMapping("employees/add")
	public List<Employee> addEmployees(@RequestBody Employee employee) {
		List<Employee> employessList = employeeService.addEmployee(employee);
		return employessList;
	}

}
