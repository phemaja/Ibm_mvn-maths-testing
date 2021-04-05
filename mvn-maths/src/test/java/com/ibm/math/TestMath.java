package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMath {
	public static math maths;
	
	@BeforeAll
	public static void steup() {
		maths =new math();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10,maths.sum(5, 5));
	}
	@Test
	public void testSub() {
		assertEquals(10,maths.sub(20, 10));
	}
	@Test
	public void testDiv() {
		assertEquals(2,maths.div(4,2));
	}
	@Test
	public void testZeroDiv() {
		//assertEquals(10,maths.sum(5, 5));
		assertThrows(ArithmeticException.class,()->maths.div(2, 0));
	}
	
	
}