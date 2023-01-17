package com.javasession.bms.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.bms.entities.Branches;
import com.javasession.bms.model.PaymentLinks;
import com.javasession.bms.service.BranchesService;
import com.javasession.bms.service.PaymentService;

@RestController
@RequestMapping("/ems")
public class BranchesController {
	@Autowired
	private BranchesService branchesService;

	@Autowired
	private PaymentService paymentService;

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

	@DeleteMapping("branches/delete")
	public String deleteBranch(@RequestBody Branches branch) {
		return branchesService.deleteBranch(branch);
	}

	@DeleteMapping("branches/delete/{id}/{id2}")
	public String deleteBranchById(@PathVariable("id") Long id, @PathVariable("id2") Long id2) {
		System.out.println("--------------------" + id2);
		return branchesService.deleteBranchById(id);
	}

	@DeleteMapping("branches/delete/byparams")
	public String deleteBranchByQueryparamId(@RequestParam("id") long id) {
		return branchesService.deleteBranchById(id);
	}

	@DeleteMapping("branches/delete/byparamss")
	public String deleteBranchByQueryparamIds(@RequestParam("id") long id, @RequestParam("email") String emailId) {
		System.out.println("------------------" + emailId);
		return branchesService.deleteBranchById(id);
	}

	@GetMapping("branches/paymentslinks/list")
	public List<PaymentLinks> getPaymentLinks() {
		return paymentService.getPaymentLinks();
	}

}
