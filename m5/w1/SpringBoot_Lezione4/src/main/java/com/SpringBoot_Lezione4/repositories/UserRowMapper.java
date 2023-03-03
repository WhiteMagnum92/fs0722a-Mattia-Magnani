package com.SpringBoot_Lezione4.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringBoot_Lezione4.models.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setName(rs.getString("name"));
		u.setLastname(rs.getString("lastname"));
		u.setCity(rs.getString("city"));
		u.setAge(rs.getInt("age"));
		u.setEmail(rs.getString("email"));
		
		return u;
	}

}
