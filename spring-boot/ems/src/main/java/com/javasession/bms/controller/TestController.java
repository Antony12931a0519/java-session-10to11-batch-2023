package com.javasession.bms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ems")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "Hello,Welcome to the EMS Application.";
	}

	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Welcom to EMS Application";
	}

}
