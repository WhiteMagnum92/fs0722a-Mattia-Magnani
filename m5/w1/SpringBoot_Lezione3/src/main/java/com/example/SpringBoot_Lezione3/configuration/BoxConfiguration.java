package com.example.SpringBoot_Lezione3.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.SpringBoot_Lezione3.classes.Box;



@Configuration
@PropertySource("classpath:application.properties")
public class BoxConfiguration {
	
	@Value("${box.x}")
	private int x;
	@Value("${box.y}")
	private int y;
	@Value("${box.name}")
	private String name;
	
	@Bean
	public  Box box() {
		return new Box(30, 10, "Box1");
	}
	
	@Bean
	public  Box boxAppProp() {
		Box b = new Box();
		b.setX(x);
		b.setY(y);
		b.setName(name);
		return b;
	}

}
