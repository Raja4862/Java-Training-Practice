package com.day11;

import java.util.Optional;

public class OptionalClassExaple {
	public static void main(String ar[]) {
		String name = null;
		Optional<String> nameOptional = Optional.ofNullable(name);
		
		if(nameOptional.isPresent()) {
			String Value = nameOptional.get();
			System.out.println(Value);
		}
	else {
		System.out.println("noo");
	}

}
	}
