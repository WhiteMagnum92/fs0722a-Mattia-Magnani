package com.SpringBoot_Lezione4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_Lezione4.models.User;
import com.SpringBoot_Lezione4.repositories.UserDaoJdbc;

@Service
public class UserService {
	
	@Autowired
	UserDaoJdbc jdbc;
	
	public User createTestUser() {
		
		/*
		 * User u1 = User.builder() .name("Mario") .lastname("Rossi") .city("Roma")
		 * .age(25) .email("m.rossi@example.com") .build();
		 */
		
		User u = new User ("Mario", "Rossi", "Roma", 25, "m.rossi@example.com");
		
		/*
		 * User u3 = new User(); u3.setName("Mario"); u3.setLastname("Rossi");
		 * u3.setCity("Roma"); u3.setAge(25); u3.setEmail("m.rossi@example.com");
		 */
		
		return u;
	
		};
		
		public void insertUser() {
			
			jdbc.createUser(createTestUser());
		}

		public User getUserById(Integer id) {
			return jdbc.getUserById(id);
		}
		
		public void updateUser(User u) {
			
			jdbc.updateUser(u);
			
		}
		
		public void removeUser(Integer id) {
			jdbc.removeUser(id);
		}
		
		public List<User> getAllUser(){
			return jdbc.getAllUser();
			
		}
}
