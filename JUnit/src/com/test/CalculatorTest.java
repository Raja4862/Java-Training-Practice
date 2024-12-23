package com.test;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {

	int input;
	int input1;
	static Calculator cal;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
		cal = new Calculator();
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
		cal = null;
	}

	@Before
	public void before() {
		System.out.println("Before");
		input = 10;
		input1 = 20;
	}

	@After
	public void After() {
		System.out.println("After");
		input = 0;
		input1 = 0;
	}

	@Test
	public void testAddition() {
		System.out.println("test Addition");
		int actual = cal.addition(input, input1);
		int expected = input + input1;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubraction() {
		System.out.println("test Subraction");
		int actual = cal.subraction(input, input1);
		int expected = input - input1;
		assertEquals(expected, actual);

	}


}
