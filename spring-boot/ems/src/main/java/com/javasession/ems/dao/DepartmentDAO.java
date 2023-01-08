package com.javasession.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javasession.ems.entities.Department;
@Repository
public interface DepartmentDAO extends CrudRepository<Department, Long>{
	
	public Department findDepartmentById(long id);

}
