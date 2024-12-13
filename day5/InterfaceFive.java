package com.day5;

interface one{
	int a =10;
}
interface  Two{
	int b =20;
}
interface Three extends one,Two{
	void sum();
	
}

class nmc implements Three{
	
	public void sum() {
		System.out.println("sum =  "+(a + b));
	}
}

public class InterfaceFive {

	public static void main(String[] args) {
		
		Three i = new nmc();
		i.sum();
		

	}

}
