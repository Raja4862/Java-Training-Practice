package com.day8;
import java.util.Scanner;

public class Palindrome {
	
	public static void main (String ar[]) {
		

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String s = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer(sb.reverse());
		
		if(sb.equals(sb1)){
			
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println("Not Palindrome");
			
		}
		
		sc.close();
	}

}
