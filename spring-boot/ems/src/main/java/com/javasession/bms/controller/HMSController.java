package com.javasession.bms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hms")
public class HMSController {

	@GetMapping("/test")
	public String test() {
		return "Hello,Welcome to the HMS Application.";
	}

	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Welcom to HMS Application";
	}

}
