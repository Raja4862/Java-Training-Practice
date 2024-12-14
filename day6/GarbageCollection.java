package com.day6;

// to invoke unreferenced object from the memory

class myclass1{
	static int count = 0;
	
	myclass1(){
		count++;
		System.out.println(count);
	}
	public void finalize() throws Throwable{
		count--;
		System.out.println(count);
		
	}
}

public class GarbageCollection {
	
	public static void main(String[] args) {
		
		myclass1 a1 = new myclass1();
		myclass1 a2 = new myclass1();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		a1 = null;
		System.gc();		
		a2 = null;
		Runtime.getRuntime().gc();
		
		
		
	}

}
