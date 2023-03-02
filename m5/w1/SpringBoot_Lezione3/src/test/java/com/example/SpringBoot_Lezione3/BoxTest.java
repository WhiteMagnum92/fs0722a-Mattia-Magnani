package com.example.SpringBoot_Lezione3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.SpringBoot_Lezione3.classes.Box;

public class BoxTest {

	Box b;
	@Before
	public void beforeTest() {
		b = new Box(20, 10, "BoxTest");
	}
	@Test
	public void testArea() {
		assertEquals(200, b.getArea());
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(60, b.getPerimeter());
	}

}
