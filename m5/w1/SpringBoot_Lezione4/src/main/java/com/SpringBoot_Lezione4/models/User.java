package com.SpringBoot_Lezione4.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	private Integer id;
	private String name;
	private String lastname;
	private String city;
	private Integer age;
	private String email;
	
	public User(String name, String lastname, String city, Integer age, String email) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.age = age;
		this.email = email;
	}

}
