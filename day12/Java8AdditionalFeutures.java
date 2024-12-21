package com.day12;

import java.util.Arrays;
//import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Java8AdditionalFeutures {

	public static void main(String[] args) {

		// #-1
		List<Integer> list = Arrays.asList(34, 34, 10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		// #-2
		// the method String.valueOf(x) is used to convert different types of data (such
		// as numbers, booleans, characters, or objects) into their string
		// representation
		List<Integer> oneList = list.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(oneList);

		// #-3.1
		List<Integer> duplicateList = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicateList);

		// #-3.2
		Set<Integer> duplicateSet = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println(" Duplicate Set of Elements : " + duplicateSet);

		// #-3.3
		Set<Integer> tempSet = new HashSet<>();
		long duplicateCount = list.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println(duplicateCount);

		// #-4
		int firstElement = list.stream().findFirst().get();
		System.out.println(firstElement);

		// #-5
		long count = list.stream().count();
		System.out.println(count);

		// #-6
		int max = list.stream().max((x, y) -> x - y).get();
		System.out.println(max);

		// #-7
		List<Employee> empList = Arrays.asList(new Employee(1010, "Raja", 7000), new Employee(1020, "Siva", 3000),
				new Employee(1030, "Swe", 3000));
		List<Employee> sortList = empList.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());
		System.out.println(sortList);

		// #-8
		List<Integer> sortList1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList1);

		// #-9
		List<Integer> ascSort = list.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(ascSort);

		// #-10
		// tempSet.clear();
		Set<Integer> tempSet1 = new HashSet<>();
		boolean flag = list.stream().filter(x -> tempSet1.add(x) == false).count() > 0 ? true : false;
		System.out.println(flag);

		// #-11
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factList = list1.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());
		System.out.println(factList);

		// #-12
		int arr[] = { 3, 5, 2, 1, 7 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		// #-13
		List<String> strList = Arrays.asList("Raja", "Praveen", "Siva");
		List<String> upperList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);

		// #-14
		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);

		// #-15
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);

		// #-16
		Consumer<String> consumer = str -> {
			if (str.contains("a"))
				System.out.println(str);
		};
		strList.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {

			if (n % 2 == 0)
				System.out.println(n);
		};
		list.forEach(evenConsumer);

		// #-17
		Predicate<String> predicate = str -> str.contains("p");
		strList.stream().filter(predicate).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);

		// #-18
		Function<String, Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else

				return "Odd";
		};
		list.stream().map(function1).forEach(System.out::println);

		// #-19
		Supplier<String[]> supplier = () -> new String[] { "One", "Two", "Three" };
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);

	}
}
