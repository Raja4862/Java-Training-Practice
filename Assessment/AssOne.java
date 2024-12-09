package com.Assessment;

class Person { // Person class
private String name;
private int age;

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

public void printDetails() {
    System.out.println("Name = " + name);
    System.out.println("Age  = " + age + "\n");
}
}
public class AssOne {    

    static public void main(String[] args) {
        
    	// first instance
        Person person1 = new Person("Raja", 22);
        person1.printDetails();

        // second instance
        Person person2 = new Person("Siva", 23);
        person2.printDetails();
    }
}
