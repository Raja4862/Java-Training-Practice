package com.day1;

import java.util.Scanner;

public class Calculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        while (true) {
	            // Display the menu
	            System.out.println("\nSimple Calculator");
	            System.out.println("Choose an operation:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice : ");
	            choice = sc.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting the calculator. Goodbye!");
	                break;  // Exit the loop
	            }

	            // Read two numbers for calculations
	            System.out.print("Enter first number: ");
	            double num1 = sc.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = sc.nextDouble();

	            double result = 0;
	            switch (choice) {
	                case 1:
	                    result = num1 + num2;
	                    System.out.println("The result is: " + result);
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    System.out.println("The result is: " + result);
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    System.out.println("The result is: " + result);
	                    break;
	                case 4:
	                    // Check for division by zero
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("The result is: " + result);
	                    } else {
	                        System.out.println("Error! Division by zero.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please choose a valid operation.");
	            }
	        }
	   sc.close();
	
}
}
