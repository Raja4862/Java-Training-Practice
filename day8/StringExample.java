package com.day8;

// String Deceleration Types = 3

public class StringExample {
	
	public static void main (String ar[]) {
		
		String s = "Celcom - 1";
		System.out.println(s);
		String s1 = new String("Celcom - 2");
		System.out.println(s1);
		char ch[] = {'C', 'e', 'l', 'c', 'o', 'm', ' ', '-', ' ', '3'};
		String s2 = new String(ch);
		System.out.println(s2);
		
		
	}

}
