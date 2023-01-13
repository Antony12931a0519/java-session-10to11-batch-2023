package com.javasession.bms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.bms.dao.EmployeeDAO;
import com.javasession.bms.model.EmployeeModel;
import com.javasession.bms.service.EmployeeService;
import com.javasession.bms.utility.EmployeeUtility;

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

		Iterable<com.javasession.bms.entities.Employee> empList = employeeDAO.findAll();

		List<EmployeeModel> employeesList = new ArrayList<>();

		for (com.javasession.bms.entities.Employee employ : empList) {
			EmployeeModel employeeModel = new EmployeeModel();
			employeeModel.setName(employ.getFirstName() + "" + employ.getLastName());
			employeeModel.setDepartment(employ.getDepartmentId()+"");
			employeeModel.setSalary(0);
			employeesList.add(employeeModel);
		}

		return employeesList;
	}

}
