package com.javasession.ems.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javasession.ems.model.Employee;

@Component
public class EmployeeUtility {

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setName("Anthony");
		employee.setDepartment("Java Full Stack");
		employee.setSalary(10000);
		employees.add(employee);

		Employee employee1 = new Employee();
		employee1.setName("Rahul");
		employee1.setDepartment("Dotnet");
		employee1.setSalary(10000);
		employees.add(employee1);

		return employees;
	}

	public List<Employee> addEmployee(Employee employee) {

		List<Employee> employees = getEmployees();

		employees.add(employee);
		return employees;

	}

}
