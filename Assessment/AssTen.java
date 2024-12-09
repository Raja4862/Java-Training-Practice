package com.Assessment;

class Shape {
 public double getArea() {
     return 0;
 }
}

class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double getArea() {
	 
     return width * height;
 }
}

public class AssTen {
 public static void main(String[] args) {
	 
     Rectangle myRectangle = new Rectangle(5, 10);

     System.out.println("The area of the rectangle is: " + myRectangle.getArea());
 }
}
