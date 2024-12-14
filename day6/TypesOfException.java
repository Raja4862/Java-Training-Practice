package com.day6;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Types of Exception (Checked, Unchecked) 

public class TypesOfException {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("txt.txt");
			System.out.println(fr);
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			}  // checked Exception

	}

}
