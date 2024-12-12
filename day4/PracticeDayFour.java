package com.day4;
class Animal{
	protected void eat() {
		System.out.println("Animal is eating");
	}
	 void move() {
		System.out.println("Animal can move");
	}
	
}
class cat extends Animal {
	protected void eat() {
		System.out.println("Cat eat Fish");
	}
	public void move() {
		System.out.println("Cat can walk");
	}
	
}
class bird extends Animal{
	protected void eat() {
		System.out.println("Birds eat Grains");
	}
	public void  move() {
		System.out.println("bird can fly");
	}
}
public class PracticeDayFour {
	
public static void main (String args[]) {
	
	Animal animal = new	bird();
	animal.move();
	animal.eat();
	
	Animal animal1 = new cat();
	animal1.move();
	animal1.eat();
	}
}