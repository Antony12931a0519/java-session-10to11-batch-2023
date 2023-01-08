package com.javasession.ems.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.ems.dao.EmployeeDAO;
import com.javasession.ems.model.EmployeeModel;
import com.javasession.ems.service.EmployeeService;
import com.javasession.ems.utility.EmployeeUtility;

@Service
public class EmployeeServceImpl implements EmployeeService {

	@Autowired
	private EmployeeUtility employeeUtility;
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<EmployeeModel> getEmployees() {

		List<EmployeeModel> employeesList = employeeUtility.getEmployees();
		return employeesList;
	}

	@Override
	public List<EmployeeModel> addEmployee(EmployeeModel employeeModel) {

		List<EmployeeModel> newEmployeesList = employeeUtility.addEmployee(employeeModel);

		return newEmployeesList;
	}

	@Override
	public List<EmployeeModel> getEmployeesFromDatabase() {

		Iterable<com.javasession.ems.entities.Employee> empList = employeeDAO.findAll();

		List<EmployeeModel> employeesList = new ArrayList<>();

		for (com.javasession.ems.entities.Employee employ : empList) {
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setName(employ.getFirstName() + "" + employ.getLastName());
			employeeModel.setDepartment(employ.getDepartmentId()+"");
			employeeModel.setSalary(0);
			employeesList.add(employeeModel);
		}

		return employeesList;
	}

}
