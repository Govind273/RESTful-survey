package com.in28minutes.springboot.firstspringbootproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
		
	@RequestMapping("/welcome")
	public String Welcome() {
		return "Hello World of Microsrvices";
	}
	
}
