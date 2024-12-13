package com.day5;

// Abstract Class With Constructor
// (We can define a n number of constructor in abstract class it can be Accessed by "Super()")

abstract class Vehicle1{
	
	abstract void NoOfWheels();
	abstract void BrandName();
	
	Vehicle1(){
		System.out.println("Abs class Constructor");
	}
	
	void NoOfEngine() {
		
		System.out.println("Have a Engine");
		
	}	
}
class Bike1 extends Vehicle1{
	
	void NoOfWheels() {
		
		System.out.println("2 Wheel");	
		
	}
	void BrandName() {
		System.out.println("Hero");
	}
}

public class AbstractClassTwo {

	public static void main(String[] args) {
		
		Vehicle1 v;
		
		
		v = new Bike1();
		v.NoOfEngine();
		v.NoOfWheels();
		v.BrandName();

	}

}
