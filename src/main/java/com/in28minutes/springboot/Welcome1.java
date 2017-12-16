package com.in28minutes.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome1 {

	@RequestMapping("/intro")
	public String showMessgae() {
		return "Hello World";
	}
}
