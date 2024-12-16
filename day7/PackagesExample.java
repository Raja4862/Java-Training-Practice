package com.day7;
import java.lang.String;
import static java.lang.Math.PI;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;



public class PackagesExample {
	
	static double a = 10;
	
	public static void main(String ar[]) {
		
		out.println(a);
		out.println(PI);
		int b = parseInt("123");
		out.println(b);
		
		try {
			int c =10/0;
			out.println(c);
		}catch(Exception e){
			
			e.printStackTrace();			
			
		}
		
		
		
	}

}
