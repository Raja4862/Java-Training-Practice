package com.day1;
//command line Argument example : 2

public class ArgTwo {

	public static void main(String[] args) {
		System.out.println("len of args = " + args.length);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int sum = a + b;
		System.out.println("sum (a+b) = " + sum);

	}

}
