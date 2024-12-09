package com.Assessment;

class Vehicle {
 public void drive() {
     System.out.println("Driving the vehicle");
 }
}
class Car extends Vehicle {
 public void drive() {
	 
     System.out.println("Repairing a car");
 }
}

public class AssNine {
 public static void main(String[] args) {
	 
     Vehicle myCar = new Car();
     
     myCar.drive();
 }
}


