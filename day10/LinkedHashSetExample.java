package com.day10;

//LinkedHashSet

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String ar[]) {
		
		Set<Integer> hs = new LinkedHashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(40);
		
		hs.add(null);
		
		
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.contains(10));
		
		
		
		
		// Way-1
		
		for(Integer i : hs) {
			System.out.println(i);
		}
		
		// Way-2
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.remove(20);
		System.out.println(hs);

	}

	
	
}
