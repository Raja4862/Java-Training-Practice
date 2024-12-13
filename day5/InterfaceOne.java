package com.day5;

// interface class has only Abstract methods

abstract interface MyInterface{
	
	void MyAbsMethod();  //by default Interfaces are Public and Abstract
	void MyAbsMethod1();
}
class myNormal implements MyInterface{
	
	public void MyAbsMethod(){
		
		System.out.println("Abs 1");
	}
	public void MyAbsMethod1(){
		System.out.println("Abs 2");
		
	}
	
	
}
public class InterfaceOne {

	public static void main(String[] args) {
		
		MyInterface a = new myNormal();
		a.MyAbsMethod();
		a.MyAbsMethod1();	
	}

}
