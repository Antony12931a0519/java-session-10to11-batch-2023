package com.javasession.ems.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javasession.ems.model.EmployeeModel;

@Component
public class EmployeeUtility {

	public List<EmployeeModel> getEmployees() {

		List<EmployeeModel> employeeModels = new ArrayList<>();
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setName("Anthony");
		employeeModel.setDepartment("Java Full Stack");
		employeeModel.setSalary(10000);
		employeeModels.add(employeeModel);

		EmployeeModel employee1 = new EmployeeModel();
		employee1.setName("Rahul");
		employee1.setDepartment("Dotnet");
		employee1.setSalary(10000);
		employeeModels.add(employee1);

		return employeeModels;
	}

	public List<EmployeeModel> addEmployee(EmployeeModel employeeModel) {

		List<EmployeeModel> employeeModels = getEmployees();

		employeeModels.add(employeeModel);
		return employeeModels;

	}

}
