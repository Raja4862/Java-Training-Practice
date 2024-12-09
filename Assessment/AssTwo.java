package com.Assessment;


class Dog{
private String name;
private String bread;

public Dog(String name, String bread) {
    this.name = name;
    this.bread = bread;
}

public void printDetails() {
    System.out.println("Dog Name = " + name);
    System.out.println("Bread    = " + bread + "\n");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBread() {
	return bread;
}

public void setBread(String bread) {
	this.bread = bread;
}
}

public class AssTwo{    // Dog class
	    
		static public void main(String[] args) {
	        
	        Dog d1 = new Dog("Black","Labour");
	        Dog d2 = new Dog("mani","husky");
	        
	        System.out.println("New added Details Of Dog");
	        d1.printDetails();
	        d2.printDetails();
	        
	        d1.setName("White"); // updating name
	        
	        System.out.println("After the name updated for Dog 1");
	        d1.printDetails();
	        
	        d2.setBread("German");// updating bread
	        
	        System.out.println("After the bread updated for Dog 2");
	        d2.printDetails();
	        
	        
	    }
	}
