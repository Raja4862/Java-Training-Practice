package com.calculator;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		int i;
		int factorial=1;
		System.out.println("Number\tFactorial ");
		for(i = 1;i <= number;i++) {
			factorial*=i;
			System.out.println(i +"\t"+ factorial);
		}
		
	}

}
