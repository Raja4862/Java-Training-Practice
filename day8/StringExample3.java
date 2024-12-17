package com.day8;

// difference between "==" and "equals()"

public class StringExample3 {

	public static void main(String ar[])
	{
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		String s = new String("Raja");
		String s1 = new String("Raja");
		String s2 = s;
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		
		
		StringBuffer sb = new StringBuffer("Praveen");
		StringBuffer sb1 = new StringBuffer("Praveen");
		System.out.println(sb==sb1);
		
		
	}
}
