package com.in28minutes.springboot.firstspringbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@Autowired
	SayHello Hello;
	
	@RequestMapping("/welcome")
	public String Welcome() {
		return Hello.message();
	}
	
}

@Component
class SayHello{
	public String message() {
		return "The World of microservices is really cool! updated";
	}
}