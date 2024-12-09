package com.Assessment;

class Animal {
	
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

class Cat extends Animal {

 public void makeSound() {

     System.out.println("Bark!");
 }
}

public class AssEight {
 public static void main(String[] args) {
	 
     Animal myCat = new Cat();
    
     myCat.makeSound();
 }
}