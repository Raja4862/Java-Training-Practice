package com.day2;
import java.util.Scanner;
public class DuplicatElementsArray {

	public static void main(String[] args) {
		int b[] = new int[5];
		int duplicatCount=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n enter 5 elemente");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
			}
		
		System.out.println("\n Array size of b = " + b.length);

		for(int i=0;i<b.length;i++) {
			System.out.print("  " + b[i]);
			for(int j=i+1;j<b.length;j++) {
			if(b[i]==b[j] && b[i]!=0 && b[j]!=0) {
				b[j]=0;
				duplicatCount++;
			}
			}
			}
		
		System.out.println("\n\n total duplicat count = " + duplicatCount);
		sc.close();
	}

}
