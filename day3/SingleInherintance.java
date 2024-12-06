package com.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I hava engine");
	}
}

class TwoWheeler extends Vehicle{
	void noOfwheel() {
		System.out.println("Its two wheel");
	}
	
}
// multilevel inheritance
class Bike extends TwoWheeler{
	void brand() {
		System.out.println("Hero");
	}
	
	
}
public class SingleInherintance {

	public static void main(String[] args) {
		
		
		Bike a = new Bike();
		a.noOfEngine();
		a.noOfwheel();
		a.brand();

	}

}
