package com.day8;

public class StringExample2 {

	public static void main(String ar[]) {

		String s = "Celcom";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));
		}

		String s1 = "Welcome to Celcom";
		String temp[] = s1.split(" ");

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
