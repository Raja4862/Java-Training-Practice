package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,30,10,70,77,55,43,24,11);
		
		// Using ForEach 
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		// using Count
		long count = list.stream().filter(x -> x % 2 == 0).count();
		System.out.println(count);
		
		// using Collect
		List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);
		
		// Including Map & sorted
		List<Integer> list2 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(list2);
		
		
		

	}

}
