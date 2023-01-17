package com.javasession.bms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.bms.dao.BranchesDAO;
import com.javasession.bms.entities.Branches;
import com.javasession.bms.service.BranchesService;

@Service
public class BranchesServiceImpl implements BranchesService {

	@Autowired
	private BranchesDAO branchesDAO;

	@Override
	public List<Branches> getBrnaches() {

		return (List<Branches>) branchesDAO.findAll();
	}

	@Override
	public String createBranch(Branches branch) {

		String result = null;

		Branches branches = branchesDAO.save(branch);

		if (branches != null) {

			result = "Branch Details are saved successfully!";
		} else {
			result = "Branch Details are not saved,Please try again.";
		}

		return result;
	}

	@Override
	public String updateBranch(Branches branch) {

		String message = null;

		Optional<Branches> object = branchesDAO.findById(branch.getId());

		if (object.isPresent()) {

			Branches branchObject = object.get();

			branchObject.setName(branch.getName());
			branchObject.setCity(branch.getCity());
			branchObject = branchesDAO.save(branchObject);

			if (branchObject != null) {

				message = "Branch details are updated successfully.";
			} else {
				message = "Branch details are not updated due to some error,Please try again.";
			}

		} else {
			message = "Could not find any details with the search criteria,Please try again with correct details.";
		}

		return message;
	}

	@Override
	public String deleteBranch(Branches branch) {

		String message = null;
		Optional<Branches> object = branchesDAO.findById(branch.getId());

		if (object.isPresent()) {

			// branchesDAO.deleteById(branch.getId());
			branchesDAO.delete(object.get());

			message = "Branch details are deleted successfully.";

		} else {
			message = "Could not find any details with the search criteria,Please try again with correct details.";
		}

		return message;
	}

	@Override
	public String deleteBranchById(Long id) {

		String message = null;
		Optional<Branches> object = branchesDAO.findById(id);

		if (object.isPresent()) {

			// branchesDAO.deleteById(branch.getId());
			branchesDAO.delete(object.get());

			message = "Branch details are deleted successfully.";

		} else {
			message = "Could not find any details with the search criteria,Please try again with correct details.";
		}

		return message;
	}

}
