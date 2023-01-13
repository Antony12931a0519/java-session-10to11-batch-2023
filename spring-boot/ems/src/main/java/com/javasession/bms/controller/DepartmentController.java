package com.javasession.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.bms.exception.DepartmentDetailsException;
import com.javasession.bms.model.DepartmentModel;
import com.javasession.bms.service.DepartmentService;

@RestController
@RequestMapping("/ems")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("departments/list")
	public List<DepartmentModel> getDepartments() {
		List<DepartmentModel> departmentsList = departmentService.getDepartments();
		return departmentsList;
	}

	@PostMapping("departments/add")
	public List<DepartmentModel> addDepartment(@RequestBody DepartmentModel departmentModel) {
		List<DepartmentModel> departmentsList = departmentService.addDepartment(departmentModel);
		return departmentsList;
	}

	@PostMapping("live/departments/add")
	public String createDepartment(@RequestBody DepartmentModel departmentModel) throws DepartmentDetailsException {
		String result = departmentService.createDepartment(departmentModel);
		return result;

	}

	@PutMapping("/departments/update")
	public String UpdateDepartment(@RequestBody DepartmentModel departmentModel) throws DepartmentDetailsException {
		String result = departmentService.updateDepartment(departmentModel);
		return result;

	}

	@GetMapping("live/departments/list")
	public List<DepartmentModel> getDepartmenntsFromDatabase() {
		List<DepartmentModel> departmentList = departmentService.getDepartmentsFromDatabase();
		return departmentList;
	}

	@DeleteMapping("/departments/delete")
	public String deleteDepartment(@RequestBody DepartmentModel departmentModel) throws DepartmentDetailsException {
		String result = departmentService.deleteDepartmentById(departmentModel);
		return result;

	}

}
