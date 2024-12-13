package com.day5;

// Abstract (0 to N number of can come with method)

abstract class MyAbstractClass{
	abstract void MyAbstractMethod();
	abstract void MyAbstractMethod1();
	void MyNormalMethod() {
		
		System.out.println("concreate / my normal methode");
		
	}	
}
class myNormalclass extends MyAbstractClass{
	
	void MyAbstractMethod() {
		
		System.out.println("AB M1");
		
		
	}
	void MyAbstractMethod1() {
		System.out.println("AB M2");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		//MyAbstractClass a = new MyAbstractClass();
		MyAbstractClass a = new myNormalclass();
	    //	a.MyNormalMethod();
		myNormalclass b = new myNormalclass();
		
		a.MyAbstractMethod();
		b.MyAbstractMethod();
		a.MyAbstractMethod1();
		b.MyAbstractMethod1();

	}

}
