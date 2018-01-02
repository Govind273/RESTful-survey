package com.in28minutes.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.configuration.BasicConfiguration;
import com.in28minutes.springboot.service.WelcomeService;

@RestController
public class Welcome {

	@Autowired
	private WelcomeService service;
	
	@Autowired
	private BasicConfiguration config;
	
	
	@RequestMapping("/welcome")
	public String showMessgae() {
		return service.retreivewelcomeMessage();
	}
	@RequestMapping("/dynamic-configuration")
	public Map showConfigs() {
		Map map = new HashMap();
		map.put("val", config.getVal());
		map.put("num",config.getNum());
		map.put("bool",config.isTrue());
		
		return map;
	}
}
