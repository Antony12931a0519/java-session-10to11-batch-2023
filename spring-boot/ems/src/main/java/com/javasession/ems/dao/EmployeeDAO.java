package com.javasession.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javasession.ems.entities.Employee;
@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Long>{

}
