package com.in28minutes.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Rohi",12,"Admin"));
		
	}

}
