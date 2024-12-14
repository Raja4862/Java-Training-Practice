package com.day6;
import java.util.Scanner;

@SuppressWarnings("serial")


// Custom exception class

class InvalidAgeException extends Exception {
   
    public String toString() {
        return "Invalid Age Exception ";
    }
}

class Age {

    void checkAge1(int age) {
        
    	if (age >= 18) {
    		System.out.println("Age is valid.");
    	}else {
    	
    	try {
    		throw new InvalidAgeException();
            
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e);
        }
    }
        }
    }

public class UsingThrow1 {
    public static void main(String[] args) {

        Age ageObj = new Age();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        ageObj.checkAge1(age);

        sc.close();
    }
}
