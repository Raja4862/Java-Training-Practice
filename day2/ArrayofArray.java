package com.day2;
import java.util.Scanner;
public class ArrayofArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter row element");
		int n = sc.nextInt();
		System.out.println("\n enter coloumn element");
		int m = sc.nextInt();
		int b[][] = new int[n][m];
		
		System.out.println("\n enter "+n+" * "+m+" elemente");
		for(int i=0;i<n;i++) {
			for(int j =0 ;j < m; j++) {
			b[i][j] = sc.nextInt();
			}
		}
	
		for(int i=0;i < n;i++) {
			for(int j =0 ;j < m; j++) {
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n Array size of b = " + b.length);
		sc.close();
	}

}
