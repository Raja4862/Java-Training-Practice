package com.day2;

public class ArrayofArrayOne {

	public static void main(String[] args) {
		
		
		
		int a[][] = new int[3][];
		a[0]=new int[] {1, 2};
		a[1]=new int[] {1, 2, 3, 3};
		a[2]=new int[] {1, 2, 4};
		
		for(int i=0;i < a.length;i++) {
			for(int j =0 ;j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
