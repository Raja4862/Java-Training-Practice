package com.day8;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOStreamsImageCopy {

	public static void main(String ar[]) {

		FileInputStream f = null;
		FileOutputStream f1 = null;

		try {
			f = new FileInputStream("D://Logo.png");
			f1 = new FileOutputStream("D://Logo1.png");

			int ch;
			while ((ch = f.read()) != -1) {
				// System.out.print((char) ch);
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
