package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.day13.FactorialExample;

public class FactorialExampleTest {
	
	
	int input;
	static FactorialExample ft;
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
		ft = new FactorialExample();
		
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
		ft =null;
	}
	@Before
	public void before() {
		System.out.println("Before");
		input = 5;
	}

	@After
	public void After() {
		System.out.println("After");
		input = 0;
	}

	@Test
	public void testFactorial() {
		int actual = FactorialExample.factorial(input);
		int excepted = 120;
		assertEquals(excepted, actual);
		
	}

}
