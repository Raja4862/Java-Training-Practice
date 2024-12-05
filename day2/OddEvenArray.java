package com.day2;
import java.util.Scanner;
public class OddEvenArray {

	public static void main(String[] args) {
		int b[] = new int[5];
		int evenCount=0;
		int oddCount=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n enter 5 elemente");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
			}
		
		System.out.println("\n Array size of b = " + b.length);

		for(int i=0;i<b.length;i++) {
			System.out.print("  " + b[i]);
			if(b[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			}
		
		System.out.println("\n\n total even no = " + evenCount);
		System.out.println("\n total odd no = " + oddCount);
		sc.close();
	}

}
