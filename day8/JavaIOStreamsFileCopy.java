package com.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOStreamsFileCopy {

	public static void main(String ar[]) {

		FileReader f = null;
		FileWriter f1 = null;

		try {
			f = new FileReader("D://Java.txt");
			f1 = new FileWriter("D://Java1.txt");

			int ch;
			while ((ch = f.read()) != -1) {
				System.out.print((char) ch);
				f1.write(ch);
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} finally {

			try {
				f.close();
				f1.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
