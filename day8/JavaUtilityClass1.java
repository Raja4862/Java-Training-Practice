package com.day8;

import java.util.Calendar;

// @SuppressWarnings("deprecation")

public class JavaUtilityClass1 {

	public static void main(String ar[]) {

		// Calendar

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));

		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));

	}

}
