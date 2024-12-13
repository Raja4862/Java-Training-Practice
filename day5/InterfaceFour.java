package com.day5;

interface VehPlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}

abstract class vehicle2 implements VehPlan{
	public void noOfEngine() {
		System.out.println("i have a engine");
	}
}

class Bike2 extends vehicle2{
	public void noOfWheels() {
		System.out.println("2 wheel");
		
	}
public void brandName() {
	System.out.println("hero");
		
	}
}
public class InterfaceFour {

	public static void main(String[] args) {
		
		VehPlan v = new Bike2();
		v.noOfEngine();
		v.noOfWheels();
		v.brandName();
		
		
		
	}

}
