package com.javasession.bms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javasession.bms.entities.Employee;
@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Long>{

}
