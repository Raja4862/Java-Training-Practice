package com.Assessment;

class Rect{
	double with;
	double height;
	
	void area(double with, double height){
	
		System.out.println("Area of Rectangal is = "+ (with*height));	
	}
	void perimeter(double with, double height){
		
		System.out.println("Perimeter of the Rectangal is = "+(2+(with+height)));
	}
}


public class AssThree {

	public static void main(String[] args) {
		
		Rect a = new Rect();
		a.area(10,10);
		a.perimeter(10,10);
		
		
		

	}

}
