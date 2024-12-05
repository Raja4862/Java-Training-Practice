package com.day1;
import java.util.Scanner;
//User input using Scanner

public class Scnr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Emp id = ");
		int id = sc.nextInt();
		System.out.println("Emp name = ");
		String name = sc.next();
		System.out.println("Emp salary = ");
		float salary = sc.nextFloat();
		System.out.println("ID = " + id);
		System.out.println("Name = " + name);
		System.out.println("salary = " + salary);
		sc.close();
	}

}
