package com.day5;

// implements multiple interfaces

abstract interface MyInterface3{
	
	void MyAbsMethod();
	}
abstract interface MyInterface4{  //by default Interfaces method are Public and Abstract
	
	void MyAbsMethod1();
}
class myNormal2 implements MyInterface1,MyInterface2{
	
	public void MyAbsMethod(){
		
		System.out.println("Abs 1");
	}
	public void MyAbsMethod1(){
		System.out.println("Abs 2");
		
	}	
}


public class InterfaceTwo {

	public static void main(String[] args) {
		
		myNormal1 a = new myNormal1();
		a.MyAbsMethod();
		a.MyAbsMethod1();	
	}

}
