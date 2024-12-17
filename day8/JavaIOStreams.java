package com.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaIOStreams {

	public static void main(String ar[]) {
		FileReader f = null;
		try {
			f = new FileReader("D://Java.txt");
			int ch;
			while((ch =f.read()) !=-1) {
				System.out.print((char)ch);
			}
			
		}catch (FileNotFoundException e) {
				
			
		}catch( IOException e) {
			
		}
		finally {
		
			try {
				f.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	}

