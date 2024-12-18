package com.day9;

@SuppressWarnings("removal")

public class WapperClassExample {

	public static void main(String[] args) {

		int a = 10;

		Integer obj = new Integer(a); // Boxing
		System.out.println(obj);

		int b = obj.intValue(); // UnBoxing
		System.out.println(b);

		Integer obj1 = a; // AutoBoxing
		System.out.println(obj1);

		int c = obj1; // AutoUnBoxing
		System.out.println(c);

	}
}
