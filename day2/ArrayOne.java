package com.day2;
import java.util.Scanner;
public class ArrayOne {

	public static void main(String[] args) {
		int b[] = new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<b.length;i++) {
			System.out.print("  " + b[i]);
		}
		System.out.println("\n enter 5 elemente");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
			}
		System.out.println("\n Array size of b = " + b.length);

		for(int i=0;i<b.length;i++) {
			System.out.print("  " + b[i]);
			sum = sum + b[i];
			}
		
		System.out.println("\n sum of  Array = " + sum);
		sc.close();
	}

}
