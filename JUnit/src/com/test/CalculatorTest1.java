package com.test;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.day13.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest1 {

	int input;
	int input1;
	int excepted;
	int excepted1;
	static Calculator cal;

	public CalculatorTest1(int input, int input1, int expected, int expected1) {
		this.input = input;
		this.input1 = input1;
		this.excepted = expected;
		this.excepted1 = expected1;
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		cal = new Calculator();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		cal = null;
	}

	@Before
	public void before() {
		System.out.println("Before");
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
		assertEquals(excepted, actual);
	}

	@Test
	public void testSubraction() {
		System.out.println("test Subraction");
		int actual = cal.subraction(input, input1);
		assertEquals(excepted1, actual);

	}

	 @Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, 3, 5, -1 }, { -2, 3, 1, -5 }, { 19, 1, 20, 18 }, { 37, 3, 40, 34 },

		});
	}

}
