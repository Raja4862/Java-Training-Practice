package com.day5;

// implements multiple interfaces
// using extends

abstract interface MyInterface1{
	
	void MyAbsMethod();
	}
abstract interface MyInterface2 extends MyInterface1{  //by default Interfaces method are Public and Abstract
	
	void MyAbsMethod1();
}
class myNormal1 implements MyInterface1,MyInterface2{
	
	public void MyAbsMethod(){
		
		System.out.println("Abs 1");
	}
	public void MyAbsMethod1(){
		System.out.println("Abs 2");
		
	}	
}


public class InterfaceThree {

	public static void main(String[] args) {
		
		MyInterface2 a = new myNormal1();
		a.MyAbsMethod();
		a.MyAbsMethod1();	
	}

}
