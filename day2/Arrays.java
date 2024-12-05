package com.day2;

public class Arrays {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[] = new int[5];
		int c[] = new int[] {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.print("  " + a[i]);
		}
		System.out.println("\n Array size of a = " + a.length);
		for(int i=0;i<b.length;i++) {
			System.out.print("  " + b[i]);
			}
		System.out.println("\n Array size of b = " + b.length);

		for(int i=0;i<c.length;i++) {
			System.out.print("  " + c[i]);
			}
		System.out.println("\n Array size of c = " + c.length);
	}

}
