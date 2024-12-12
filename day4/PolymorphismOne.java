package com.day4;

//overloading (Data types)

class NewOne{
	
	void myMethod(int a,int b) {
		
		System.out.println("m1 = "+(a+b));
		
	}
	
	void myMethod(float a,float b) {
		System.out.println("m2 = "+(a+b));
		
	}
	void myMethod(double a,double b) {
		
		System.out.println("m3 = "+(a+b));
		
	}
	void myMethod(char a,char b) {
		
		System.out.println("m4 = "+(a+b));
		
	}
	void myMethod(String a,String b) {
		
		System.out.println("m4 = "+(a+b));
		
	}
}

public class PolymorphismOne {

	public static void main(String[] args) {
		
		NewOne a = new NewOne();
		a.myMethod(5,5);
		a.myMethod(5.0,5.0);
		a.myMethod(5.00,5.00);
		a.myMethod('A', 'B');
		a.myMethod("Hello", " celcom");
		

	}

}
