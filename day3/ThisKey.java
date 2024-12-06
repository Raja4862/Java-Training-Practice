package com.day3;

// constructor Invocation Order

class B{
	B(){
		//this(5);
		super();
		System.out.println("B");
	}
	B(int a){
		System.out.println("B1");
	}
	B(String b){
		System.out.println("B2");
	}
}
class A extends B{
	A(){
		//this(5);
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}

public class ThisKey {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);

	}

}
