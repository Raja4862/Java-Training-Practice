package com.day11;

@FunctionalInterface
interface MyInterface {
	double Calculator(double a, double b); // PUBLIC & ABSTRACT
}
/*
//Without Lambda Expression
class Addition implements MyInterface {

	public double Calculator(double a, double b) {
		return a + b;
	}

}

class Subtraction implements MyInterface {

	public double Calculator(double a, double b) {
		return a - b;
	}

}
*/
public class Java8FunctionalInterfaceExample {
	public static void main(String ar[]) {

		System.out.println("Additon");
		MyInterface ref = (a,b) -> a+b;
		System.out.println(ref.Calculator(10, 20));
		System.out.println(ref.Calculator(1, 22));
		
		System.out.println("Subtraction");
		ref = (a,b) -> a-b;
		System.out.println(ref.Calculator(30, 20));
		System.out.println(ref.Calculator(111, 22));
		
	}

}
