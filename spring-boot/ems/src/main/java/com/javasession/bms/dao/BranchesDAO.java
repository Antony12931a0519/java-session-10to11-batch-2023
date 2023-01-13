package com.javasession.bms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javasession.bms.entities.Branches;

@Repository
public interface  BranchesDAO extends CrudRepository<Branches, Long> {

}
