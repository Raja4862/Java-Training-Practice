package com.day2;

class MyClass{
	int b = 10; // Instance or Object Variable (Default = 0)
	static int c =20; // static or Class Variable (Default = 0)
	
	
}
public class TypesOfVariables {

	public static void main(String[] args) {
		int a = 17; // Local Variable (No Default)
		System.out.println(a);
		MyClass obj =new MyClass();
		System.out.println(obj.b);
		System.out.println(MyClass.c);


	}

}
