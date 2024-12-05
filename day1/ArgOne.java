package com.day1;
public class ArgOne {

	public static void main(String[] args) {
		System.out.println("len of args = " + args.length);
		
		if (args.length >= 2) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int sum = a + b;
		System.out.println("sum (a+b) = " + sum);
		}
		else {
			
		System.out.println("insufficent input");
		}

	}

}