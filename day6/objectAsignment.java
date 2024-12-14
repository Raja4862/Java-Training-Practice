package com.day6;
class myclass2{
	int a = 10;
}

public class objectAsignment {
public static void main(String[] args) {
		
		myclass2 a1 = new myclass2();
		myclass2 a2 = a1;
		System.out.println(a1.a);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
}

}
