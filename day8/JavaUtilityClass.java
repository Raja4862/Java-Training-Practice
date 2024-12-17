package com.day8;
import java.util.Date;
import java.util.Calendar;

@SuppressWarnings("deprecation")

public class JavaUtilityClass {
	

	
	
	public static void  main(String ar[]) {
		
		// Date
		
		Date currentDate = new Date();
		
		System.out.println(currentDate);
		System.out.println(currentDate.getDate());
		System.out.println(currentDate.getDay());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getYear());
		
		System.out.println(currentDate.getHours());
		System.out.println(currentDate.getMinutes());
		System.out.println(currentDate.getSeconds());
		
		System.out.println(currentDate.getTimezoneOffset());
		
		
		//Calendar
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		
	}

}
