package com.javasession.bms.service;

import java.util.List;

import com.javasession.bms.entities.Branches;

public interface BranchesService {

	public List<Branches> getBrnaches();

	public String createBranch(Branches branch);

	public String updateBranch(Branches branch);

}
