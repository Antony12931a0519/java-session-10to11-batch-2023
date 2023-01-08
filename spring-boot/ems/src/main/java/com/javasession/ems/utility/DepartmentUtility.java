package com.javasession.ems.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javasession.ems.entities.Department;
import com.javasession.ems.model.DepartmentModel;

@Component
public class DepartmentUtility {

	public List<DepartmentModel> getDepartments() {

		List<DepartmentModel> departmentModels = new ArrayList<>();
		DepartmentModel departmentModel = new DepartmentModel();
		departmentModel.setName("CSE");
		departmentModel.setDescription("Computer science engoneering.");
		departmentModels.add(departmentModel);

		DepartmentModel department1 = new DepartmentModel();
		department1.setName("ECE");
		department1.setDescription("Electroncs engoneering.");
		departmentModels.add(department1);
		return departmentModels;
	}

	public List<DepartmentModel> addEmployee(DepartmentModel departmentModel) {
		List<DepartmentModel> departmentModels = getDepartments();
		departmentModels.add(departmentModel);
		return departmentModels;
	}

	public Department transformToDeparmentEntity(DepartmentModel departmentModel) {

		return Department.builder().description(departmentModel.getDescription()).name(departmentModel.getName())
				.totalNumberOfMembers(100).build();
	}

}
