package com.day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DeserializationExample {

	public static void main(String[] args) {

		FileInputStream f = null;
		ObjectInputStream of = null;
		try {
			f = new FileInputStream("D://ObjectFile.txt");
			of = new ObjectInputStream(f);
			Employee e = (Employee) of.readObject();

			System.out.println("Employee Name = " + e.getName());
			System.out.println("Employee ID = " + e.getEmpId());
			System.out.println("object Readed Succesfully");

		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());

		} finally {
			try {
				of.close();
				f.close();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}

		}

	}
}