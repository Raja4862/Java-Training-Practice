package com.day11;

interface MyInterface2{
	void MyabsMethod();
	default void myDefaultMethod() {
		System.out.println("Hello Default");
	}
	static void MyStaticMethod(){
		System.out.println("Hello Static");
	}
}

public class Java8DefaultInterfaceExample {

}
