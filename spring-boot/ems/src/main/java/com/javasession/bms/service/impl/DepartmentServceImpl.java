package com.javasession.bms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.bms.dao.DepartmentDAO;
import com.javasession.bms.entities.Department;
import com.javasession.bms.exception.DepartmentDetailsException;
import com.javasession.bms.model.DepartmentModel;
import com.javasession.bms.service.DepartmentService;
import com.javasession.bms.utility.DepartmentUtility;

@Service
public class DepartmentServceImpl implements DepartmentService {

	@Autowired
	private DepartmentUtility departmentUtility;

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	public List<DepartmentModel> getDepartments() {
		List<DepartmentModel> departmentsList = departmentUtility.getDepartments();
		return departmentsList;
	}

	@Override
	public List<DepartmentModel> addDepartment(DepartmentModel departmentModel) {
		List<DepartmentModel> departmentsList = departmentUtility.addEmployee(departmentModel);

		return departmentsList;
	}

	@Override
	public String createDepartment(DepartmentModel departmentModel) throws DepartmentDetailsException {
		String result = null;
		if (null != departmentModel && null != departmentModel.getDescription() && null != departmentModel.getName()) {
			Department department = departmentUtility.transformToDeparmentEntity(departmentModel);
			department = departmentDAO.save(department);
			if (null != department) {
				result = "Department is saved successfully.";
			} else {
				result = "Department is not saved due to some internal isssue,Please try again.";
			}
		} else {
			throw new DepartmentDetailsException("Departments details name,description are mandatory.", 400);
		}
		return result;
	}

	@Override
	public List<DepartmentModel> getDepartmentsFromDatabase() {
		Iterable<Department> departmentListFromDb = departmentDAO.findAll();
		List<DepartmentModel> departmentList = new ArrayList<>();
		for (Department department : departmentListFromDb) {
			DepartmentModel departmentModel = new DepartmentModel();
			departmentModel.setName(department.getName());
			departmentModel.setDescription(department.getDescription());
			departmentModel.setTotalNumberOfMembers(department.getTotalNumberOfMembers());
			departmentList.add(departmentModel);
		}
		return departmentList;
	}

	@Override
	public String updateDepartment(DepartmentModel departmentModel) throws DepartmentDetailsException {
		String result = null;
		if (null != departmentModel && departmentModel.getId() != 0) {
			Department department = null;
			department = findDepartmentById(departmentModel.getId());
			if (null != department) {
				department.setId(departmentModel.getId());
				if (null != departmentModel.getDescription())
					department.setDescription(departmentModel.getDescription());
				if (null != departmentModel.getName())
					department.setName(departmentModel.getName());
				if (departmentModel.getTotalNumberOfMembers() != 0)
					department.setTotalNumberOfMembers(departmentModel.getTotalNumberOfMembers());
				department = departmentDAO.save(department);
				if (null != department) {
					result = "Department details  are updated successfully.";
				} else {
					result = "Department details are not updated due to some internal isssue,Please try again.";
				}
			} else {
				result = "Could not fetch any details with the requested data,Please try again with correct data";
			}
		} else {
			throw new DepartmentDetailsException("Departments details <Id> is mandatory for updating the details.",
					400);
		}
		return result;
	}

	@Override
	public Department findDepartmentById(long id) {
		Optional<Department> department = null;
		if (id != 0) {
			department = departmentDAO.findById(id);
			if (null != department && department.isPresent()) {
				return department.get();
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public String deleteDepartmentById(DepartmentModel departmentModel) throws DepartmentDetailsException {

		String result = null;
		if (null != departmentModel && departmentModel.getId() != 0) {
			Department department = null;
			department = findDepartmentById(departmentModel.getId());
			if (null != department) {
				departmentDAO.deleteById(departmentModel.getId());
				result = "Department details deleted successfully";
			} else {
				result = "Could not fetch any details with the requested data,Please try again with correct data";
			}
		} else {
			throw new DepartmentDetailsException("Departments details <Id> is mandatory for updating the details.",
					400);
		}
		return result;
	}
}
