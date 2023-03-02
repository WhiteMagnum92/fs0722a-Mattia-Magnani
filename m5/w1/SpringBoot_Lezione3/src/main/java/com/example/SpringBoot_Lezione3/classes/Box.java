package com.example.SpringBoot_Lezione3.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Box {

	private Integer x;
	private Integer y;
	private String name;

	public int getArea() {
		return x * y;
	}

	public int getPerimeter() {
		return (x + y) * 2;
	}

}