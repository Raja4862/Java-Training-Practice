package com.day7;

interface inner3{
	void dis();
}

public class InnerClass {
	
	class inner{
		void dis() {
			System.out.println("non static method");
		}
	}
	static class inner1{
		void dis() {
			System.out.println("static method");
		}
	}
	
	public static void main (String ar[]) {
		
		InnerClass a = new InnerClass();
		inner i = a.new inner();
		i.dis();
		
		inner1 i1 = new InnerClass.inner1();
		i1.dis();
		
		class inner2{
			void dis() {
				System.out.println("local inner");
			}
		}
		
		inner2 i2 =new inner2();
		i2.dis();
		inner3 i3 = new inner3(){
            public void dis() {
                System.out.println("Anonymous inner class running");
               
            }
        };
        
        i3.dis();
		
	}

}
