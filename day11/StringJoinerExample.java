package com.day11;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String ar[]) {
		
		StringJoiner jo = new StringJoiner(",");
		
		jo.add("Praveen");
		jo.add("Raja");
		
		String result = jo.toString();
		System.out.println(result);
		
		StringJoiner jo1 = new StringJoiner(",","{","}");
		
		jo1.add("Praveen");
		jo1.add("Raja");
		jo1.add("S");
		
		String result1 = jo1.toString();
		System.out.println(result1);
	}

}
