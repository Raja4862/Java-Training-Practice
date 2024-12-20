package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry");

		fruits.forEach(fruit -> System.out.println(fruit));
	}
}