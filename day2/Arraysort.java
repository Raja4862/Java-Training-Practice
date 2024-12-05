package com.day2;
import java.util.Scanner;
import java.util.Arrays;
public class Arraysort {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter no elemente");
		n = sc.nextInt();
		int b[] = new int[n];
		
		System.out.println("\n enter "+n+" elemente");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
			}
		Arrays.sort(b);
	
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			}
		for(int i : b) {
			System.out.println(i);
			
		}
		
		System.out.println("\n Array size of b = " + b.length);
		sc.close();
	}

}
