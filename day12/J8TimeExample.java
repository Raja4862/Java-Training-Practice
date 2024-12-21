package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class J8TimeExample {
	
	public static void main(String[] args) {
		
		LocalDate currentdate = LocalDate.now(); // Date
		
		LocalTime currentTime = LocalTime.now(); // Time
		
		LocalDateTime datetime = LocalDateTime.now(); // Date and Time
		
		DateTimeFormatter fm  = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		
		System.out.println(currentdate);
		System.out.println(currentTime);
		System.out.println(datetime);
		System.out.println(fm);
	}

}
