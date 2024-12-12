package com.day4;

// overriding
class NewThree{
	void NoOfEngine() {
		System.out.println("Eng");
	}
	void NoOfWheel() {
		System.out.println("wh");
	}
}
class TwoWheeler extends NewThree{
//		void NoOfEngine() {
//			System.out.println("i have a Eng");
//		}
		void NoOfWheel() {
			System.out.println("i have whl");
		}	
}

public class PolymorphismThree {

	public static void main(String[] args) {
		
		TwoWheeler a = new TwoWheeler();
		a.NoOfEngine();
		a.NoOfWheel();
			
		
	}
}
