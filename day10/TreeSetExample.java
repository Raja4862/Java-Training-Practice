package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String ar[]) {
		
		SortedSet<Integer> hs = new TreeSet<>(Collections.reverseOrder());
		
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(40);
		
		
		
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

