package com.day8;

// import java.util.StringJoiner; // its in java - 8

import java.util.StringTokenizer;

// @SuppressWarnings("deprecation")

public class JavaUtilityClass2 {

	public static void main(String ar[]) {

		String s = "Raja is a good boy";

		StringTokenizer st = new StringTokenizer(s, " ");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {

			System.out.println(st.nextToken());
		}

	}

}
