package com.SpringBoot_Lezione7.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_Lezione7.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public boolean existsByNameAndLastname(String name, String lastname);

}
