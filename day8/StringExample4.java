package com.day8;

public class StringExample4 {
	
	public static void main (String ar[]){
		
		String s = new String("Praveen");
		s.concat(" Raja");
		System.out.println(s);
		
		String s1 = new String("Praveen");
		s1=s1.concat(" Raja");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Praveen");
		sb.append(" Raja");
		System.out.println(sb);
		
		// System.out.println(sb.reverse());
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
	}

}
