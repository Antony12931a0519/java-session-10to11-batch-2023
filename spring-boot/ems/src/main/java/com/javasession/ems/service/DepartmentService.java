package com.javasession.ems.service;

import java.util.List;

import com.javasession.ems.entities.Department;
import com.javasession.ems.exception.DepartmentDetailsException;
import com.javasession.ems.model.DepartmentModel;

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
