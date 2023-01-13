package com.javasession.bms.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javasession.bms.model.EmployeeModel;

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
		
		EmployeeModel employeeModel2 = new EmployeeModel();
		employeeModel2.setName("Chandu");
		employeeModel2.setDepartment("Java Full Stack");
		employeeModel2.setSalary(10000);
		employeeModels.add(employeeModel2);

		EmployeeModel employeeModel3 = new EmployeeModel();
		employeeModel3.setName("Raj");
		employeeModel3.setDepartment("Dotnet");
		employeeModel3.setSalary(10000);
		employeeModels.add(employeeModel3);

		return employeeModels;
	}

	public List<EmployeeModel> addEmployee(EmployeeModel employeeModel) {

		List<EmployeeModel> employeeModels = getEmployees();

		employeeModels.add(employeeModel);
		return employeeModels;

	}

}
