package com.day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
// import java.io.FileInputStream;
// import java.io.ObjectInputStream;



public class SerializationExample {

	public static void main(String[] args) {

		Employee e = new Employee("raja", 111);
		System.out.println(e);
		try {
			FileOutputStream f = new FileOutputStream("D://ObjectFile.txt");
			ObjectOutputStream of = new ObjectOutputStream(f);
			of.writeObject(e);
			of.close();
			f.close();
			System.out.println("object saved");
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}

	}

}
