package com.day3;

class Shape{
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
	void Area(){
		System.out.println("can't calculate area");
		
	}
}

class Rectangale extends Shape{

	public Rectangale(float length, float breath) {
		super(length,breath);	
	}
	void area() {
		
		System.out.println("area of Rectangale = "+(length*breath));
	}
	
}

class Squre extends Shape{

	public Squre(float side) {
		super(side);	
	}
	void area() {
		
		System.out.println("area of Square = "+(side*side));
	}
	
}

class Triangale extends Shape{

	public Triangale(float length,float breath,float height) {
		super(length,breath,height);	
	}
	void area() {
		
		System.out.println("area of traingal = "+(length*breath*height));
	}
	
}


public class Area {

	public static void main(String[] args) {
		
		Rectangale rectangale = new Rectangale(10,20);
		rectangale.area();
		
		Squre squre = new Squre(10);
		squre.area();
		
		Triangale triangale = new Triangale(10,10,10);
		triangale.area();
		

		
	}

}
