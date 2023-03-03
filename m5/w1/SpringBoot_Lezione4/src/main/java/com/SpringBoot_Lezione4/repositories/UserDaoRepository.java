package com.SpringBoot_Lezione4.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBoot_Lezione4.models.User;

@Repository
public interface UserDaoRepository {
	
	public void createUser(User u);
	public void updateUser(User u);
	public void removeUser(Integer id);
	public User getUserById(Integer id);
	public List<User>getAllUser();
	
}
