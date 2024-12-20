package com.day11;

@FunctionalInterface
interface MyInterface1 {
	void ShowMsg(); // PUBLIC & ABSTRACT
}


public class MethodReferenceExample {
	void MyInstanceMethod() {
		System.out.println("Example for Instance Method Reference");
	}
	
	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
		
	}
	MethodReferenceExample(){
		System.out.println("Example for Constructor");
	}
	
	public static void main(String ar[]) {
		
		//Reference to a Instance Method
		MethodReferenceExample obj = new MethodReferenceExample();
		MyInterface1 reference = obj :: MyInstanceMethod;
		reference.ShowMsg();
		
		//Reference to a Static Method
		reference = MethodReferenceExample :: myStaticMethod;
		reference.ShowMsg();
		
		//Reference to Constructor
		reference = MethodReferenceExample :: new;
		reference.ShowMsg();
		
	}
	

}
