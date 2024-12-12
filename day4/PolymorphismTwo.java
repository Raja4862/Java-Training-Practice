package com.day4;

//overloading (Constructor)(will happen with in a class)

class NewTwo{
	int a;
	int b;
	
	NewTwo(int a, int b) {
		this.a=a;
		this.b=b;
	}
	NewTwo(int a, int b,int c) {
		this.a=c;
		this.b=b;
	}
	NewTwo(int a, int b,int c, int d ) {
		this.b=d;
		this.a=c;
	}
	void disp() {
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
}

public class PolymorphismTwo {

	public static void main(String[] args) {
		
		NewTwo a = new NewTwo(1,2);
		a.disp();
		NewTwo b = new NewTwo(1,2,3);
		b.disp();
		NewTwo c = new NewTwo(1,2,3,4);
		c.disp();
		
			

	}

}
