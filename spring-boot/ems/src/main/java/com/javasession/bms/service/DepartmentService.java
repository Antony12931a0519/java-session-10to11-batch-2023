package com.javasession.bms.service;

import java.util.List;

import com.javasession.bms.entities.Department;
import com.javasession.bms.exception.DepartmentDetailsException;
import com.javasession.bms.model.DepartmentModel;

public interface DepartmentService {
	// for retrieving the list of departments
	public List<DepartmentModel> getDepartments();

	// for adding the department to the system
	public List<DepartmentModel> addDepartment(DepartmentModel departmentModel);

	// for adding the department to the system
	public String createDepartment(DepartmentModel departmentModel) throws DepartmentDetailsException;

	public String updateDepartment(DepartmentModel departmentModel) throws DepartmentDetailsException;

	public List<DepartmentModel> getDepartmentsFromDatabase();
	
	public Department findDepartmentById(long id);
	
	public String deleteDepartmentById(DepartmentModel departmentModel) throws DepartmentDetailsException;

}
