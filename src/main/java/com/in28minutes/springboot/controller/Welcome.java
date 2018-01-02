package com.in28minutes.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@Value("${welcome.message}")
	private String welcomeMessage;
	@RequestMapping("/welcome")
	public String showMessgae() {
		return welcomeMessage;
	}
}
