package com.day7;


class MyThread3 implements Runnable{
	public void run(){
		
		for(int i = 0; i <=5; i++) {
			System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	  }	
	}
}

public class MultiThreading2 {
	//@SuppressWarnings("removal")
	public static void main(String ar[]) {

		Thread t1 = new Thread(new MyThread3());
		t1.setName("Raja-1");
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Main thread ");
		
		
	}

}
