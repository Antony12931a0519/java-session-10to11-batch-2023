package com.javasession.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.ems.model.Employee;
import com.javasession.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
public class TestController {
	

	@GetMapping("/test")
	public String test() {
		return "Hello,Welcome to the EMS Application.";
	}

	

}
