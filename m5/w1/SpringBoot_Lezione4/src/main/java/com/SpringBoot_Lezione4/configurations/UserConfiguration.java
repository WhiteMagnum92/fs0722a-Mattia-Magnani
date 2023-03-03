package com.SpringBoot_Lezione4.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.SpringBoot_Lezione4.models.User;

@Configuration
public class UserConfiguration {

	@Bean
	@Scope("prototype")
	public User testUser() {
		return new User ("Mario", "Rossi", "Roma", 25, "m.rossi@example.com");
	}
	
}
