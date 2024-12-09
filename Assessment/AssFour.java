package com.Assessment;


class Circle{
	
    private double radius;

    // Constructor
    public Circle(double radius) {
            this.radius = radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter method for the radius
    public void setRadius(double radius) {
       this.radius = radius;
        }
    // Method to calculate the area of the circle
    public void calculateArea() {
     
        System.out.println("Area : " + (Math.PI * radius * radius));
    }

    // Method to calculate the circumference of the circle
    public void calculateCircumference() {
        
        System.out.println("Circumference: " +(2 * Math.PI * radius));
    }
}
public class AssFour 
 {
    public static void main(String[] args) {
    	
        // Circle object
        Circle C = new Circle(5);

        System.out.println("initial (5) radius, area, and circumference");
        C.calculateArea();
        C.calculateCircumference();
        
        C.setRadius(10);

        System.out.println("updated (10) radius, area, and circumference");
        C.calculateArea();
        C.calculateCircumference();
    }
}
