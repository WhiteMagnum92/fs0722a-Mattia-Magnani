package com.SpringBoot_Lezione4.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.SpringBoot_Lezione4.models.User;

@Component
public class UserDaoJdbc implements UserDaoRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void createUser(User u) {
		String sql= "INSERT INTO users (name, lastname, city, age, email)" + "VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, u.getName(), u.getLastname(),u.getCity(),u.getAge(),u.getEmail());

	}

	@Override
	public void updateUser(User u) {
	
		String sql= "UPDATE users SET name = ?,"
				+"lastname = ?," 
				+"city = ?," 
				+"age = ?," 
				+"email = ?,"
				+ "WHERE id = ?";
		
		jdbcTemplate.update(
				sql,
				u.getName(),
				u.getLastname(),
				u.getCity(),
				u.getAge(),
				u.getEmail(),
				u.getId()
				);
		
	}

	@Override
	public void removeUser(Integer id) {
		
		String sql = "DELETE FROM users WHERE id = ?";
		jdbcTemplate.update(sql,id);

	}

	@Override
	public User getUserById(Integer id) {
		
		String sql = "SELECT * FROM users WHERE id = ?";
		User u = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
		return u;
		
	}

	@Override
	public List<User> getAllUser() {
		
		String sql = "SELECT * FROM users";
		List<User> userList = jdbcTemplate.query(sql, new UserRowMapper());
		return null;
		
	}
	
}
