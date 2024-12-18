package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String ar[]) {

		// ArrayList list = new ArrayList(); // it is not recommended
		
		List<Integer> l = new ArrayList<>(); // only of integer type
		
		// List<Object> l = new ArrayList<>(); // all type of data

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		l.add(1,50); // Adding to 1 index position
		System.out.println(l);
		
		System.out.println(l.get(1)); // getting first element value
		
		l.remove(0); //removing 0th element
		System.out.println(l);
		
		l.set(2, 25); // replacing 2 position element
		System.out.println(l);
		
		System.out.println(l.contains(20)); // checks for the element presence
		
		System.out.println(l.size()); // returns how many element in the List
		
		System.out.println(l.isEmpty()); // checks for empty
		
		// Way-1
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//Way-2
		for(Integer i : l) {
			System.out.println(i);
		}
		
		//Way-3
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//way-4
		
		 ListIterator<Integer> li = l.listIterator();

	        // Traverse forward
	        System.out.println("Forward Traversal:");
	        while (li.hasNext()) {
	            System.out.println(li.next());
	        }

	        // Traverse backward
	        System.out.println("\nBackward Traversal:");
	        while (li.hasPrevious()) {
	            System.out.println(li.previous());
	        }
	        
	      //Way
			Iterator<Integer> it1 = l.iterator();
			while(it1.hasNext()) {
				Integer i =it1.next();
				if(i%2==1)
				{
					it1.remove();
				}
				}
			
				System.out.println(l);
		
		
	}

}
