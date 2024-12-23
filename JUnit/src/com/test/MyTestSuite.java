package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	CalculatorTest1.class,
	FactorialExampleTest.class
})
public class MyTestSuite {



}
