package com.day5;

// Calculate Area using Abstract class DMD(Dynamic method Dispatch)

abstract class Shape{
	float length;
	float breath;
	float side;
	float height;
	
	public Shape(float length, float breath) {
		this.length = length;
		this.breath = breath;
	}

	public Shape(float side) {
		this.side = side;
	}

	public Shape(float length, float breath, float hight) {
		this.length = length;
		this.breath = breath;
		this.height = hight;
	}
	abstract void Area();
}

class Rectangale extends Shape{

	public Rectangale(float length, float breath) {
		super(length,breath);	
	}
	void Area() {
		
		System.out.println("area of Rectangale = "+(length*breath));
	}
	
}

class Squre extends Shape{

	public Squre(float side) {
		super(side);	
	}
	void Area() {
		
		System.out.println("area of Square = "+(side*side));
	}
	
}

class Triangale extends Shape{

	public Triangale(float length,float breath,float height) {
		super(length,breath,height);	
	}
	void Area() {
		
		System.out.println("area of traingal = "+(length*breath*height));
	}
	
}


public class Area {

	public static void main(String[] args) {
		
		Shape s ;
		s = new Rectangale(10,20);
		s.Area();
		
		s = new Squre(10);
		s.Area();
		
		s = new Triangale(10,10,10);
		s.Area();
		

		
	}

}
