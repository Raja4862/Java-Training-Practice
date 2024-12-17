package com.day8;

// String Methods

public class StringExample1 {
	
	public static void main (String ar[]) {
		
		String s = "Celcom - 1";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.concat(" Solutions"));
		System.out.println(s.equals("celcom"));
		System.out.println(s.equalsIgnoreCase("CELCOM"));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.indexOf('e'));
		
		System.out.println(s.startsWith("C"));
		System.out.println(s.endsWith("h"));
		
		System.out.println(s.replace('C', 'W'));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		
		String s1 = new String("Hello");
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 4));
		
		
	}

}
