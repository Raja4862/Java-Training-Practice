package com.day5;

// 0-100% of Abstraction
// Abstract (0 to N number of can come with method)
// need to override all the abstract method
abstract class Vehicle{
	
	abstract void NoOfWheels();
	abstract void BrandName();
	
	void NoOfEngine() {
		
		System.out.println("Have a Engine");
		
	}	
}
class Bike extends Vehicle{
	
	void NoOfWheels() {
		
		System.out.println("2 Wheel");	
		
	}
	void BrandName() {
		System.out.println("Hero");
	}
}

class Car extends Vehicle{
	
	void NoOfWheels() {
		
		System.out.println("4 Wheel");	
		
	}
	void BrandName() {
		System.out.println("VOLVO");
	}
}

public class AbstractClassOne {

	public static void main(String[] args) {
		
		Vehicle v;
		
		
		v = new Bike();
		v.NoOfEngine();
		v.NoOfWheels();
		v.BrandName();
		
		
		v = new Car();
		v.NoOfEngine();
		v.NoOfWheels();
		v.BrandName();

	}

}
