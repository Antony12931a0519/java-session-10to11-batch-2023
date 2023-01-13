package com.javasession.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.bms.entities.Branches;
import com.javasession.bms.service.BranchesService;

@RestController
@RequestMapping("/ems")
public class BranchesController {
	@Autowired
	private BranchesService branchesService;

	@GetMapping("branches/list")
	public List<Branches> getBranches() {
		return branchesService.getBrnaches();
	}

	@PostMapping("branches/add")
	public String createBranch(@RequestBody Branches branch) {
		return branchesService.createBranch(branch);
	}

	@PutMapping("branches/update")
	public String updateBranch(@RequestBody Branches branch) {
		return branchesService.updateBranch(branch);
	}

}
