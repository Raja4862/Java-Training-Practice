package com.day6;
import java.io.FileNotFoundException;
import java.io.FileReader;


class myClass{
	void myMethod()throws FileNotFoundException{
		
		FileReader fr = new FileReader("Arg.c");
		System.out.println(fr);
		
	}
	void myMethod1(){
		
		try {
			myMethod();
			
		}catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
			System.out.println("Enter correct file name");
			//myMethod1();
		}
		
	}
}

// Types of Exception (Checked, Unchecked) 

public class TypesOfException1 {

	public static void main(String[] args) {

			
     myClass o = new myClass();
     o.myMethod1();

	}

}
