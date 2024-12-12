package com.day4;

//overloading 

class New{
	
	void myMethod(int a) {
		
		System.out.println("m1 = "+a);
		
	}
	
	void myMethod(int a,int b) {
		System.out.println("m2 = "+(a+b));
		
	}
	void myMethod(String a) {
		
		System.out.println("m3 = "+a);
		
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		New a = new New();
		a.myMethod(5);
		a.myMethod(5, 5);
		a.myMethod("Hello celcom");
		

	}

}
