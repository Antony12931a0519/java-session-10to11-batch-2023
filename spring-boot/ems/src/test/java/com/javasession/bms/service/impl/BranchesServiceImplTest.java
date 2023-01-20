package com.javasession.bms.service.impl;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.javasession.bms.BmsApplication;
import com.javasession.bms.dao.BranchesDAO;
import com.javasession.bms.entities.Branches;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BmsApplication.class)
@ContextConfiguration
public class BranchesServiceImplTest {

	@InjectMocks
	private BranchesServiceImpl branchesServiceImpl;

	@Mock
	private BranchesDAO branchesDAO;

	@SuppressWarnings("deprecation")
	@Test
	public void testSuccessForUpdateBranches() {

		Branches branches = new Branches();
		branches.setId(101);

		Optional<Branches> optObject = Optional.of(branches);

		Mockito.when(branchesDAO.findById(branches.getId())).thenReturn(optObject);

		Mockito.when(branchesDAO.save(branches)).thenReturn(branches);

		String message = branchesServiceImpl.updateBranch(branches);
		
		Assert.assertEquals("Branch details are updated successfully.", message);
	}

}
