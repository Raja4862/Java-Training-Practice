package com.day9;

import java.util.Enumeration;
//import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String ar[]) {
		
		Vector<Integer> vec = new Vector<>(3,2);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(20);
		vec.add(30);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(40);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
	}
}
