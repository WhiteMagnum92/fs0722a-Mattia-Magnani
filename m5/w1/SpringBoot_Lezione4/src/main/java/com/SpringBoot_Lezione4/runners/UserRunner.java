package com.SpringBoot_Lezione4.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBoot_Lezione4.services.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("UserRunner is running...");
		
		userService.insertUser();
		
	}

}
