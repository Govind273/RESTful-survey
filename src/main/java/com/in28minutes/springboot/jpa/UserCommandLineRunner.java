package com.in28minutes.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	
	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);
	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Rohit",12,"Admin"));
		repository.save(new User("Rahul",15,"Employee"));
		repository.save(new User("Rohan",22,"Admin"));
		
		
		for(User user: repository.findAll()) {
			log.info(user.toString());
		}
		
		
		
	}

}
