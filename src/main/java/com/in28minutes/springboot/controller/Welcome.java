package com.in28minutes.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@RequestMapping("/welcome")
	public String showMessgae() {
		return "Hello Bloody Fucking World";
	}
}
