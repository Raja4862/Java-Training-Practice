package com.day6;
class myclass3 implements Cloneable{
	int a = 10;
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
}

public class ObjectCloning {
public static void main(String[] args) {
		
	 try {
         myclass3 a1 = new myclass3();
         myclass3 a2 = (myclass3) a1.clone();
         System.out.println(a1.a);           // Prints 10
         System.out.println(a1.hashCode());  // Prints a1's hash code
         System.out.println(a2.hashCode());  // Prints a2's hash code (different)
     } 
	 catch (CloneNotSupportedException e) {
    	 
		 System.out.println(e.getMessage());
         
     }
}

}