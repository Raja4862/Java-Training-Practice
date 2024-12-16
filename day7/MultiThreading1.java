package com.day7;


class MyThread2 extends Thread{
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

public class MultiThreading1 {
	// @SuppressWarnings("removal")
	public static void main(String ar[]) {

		MyThread2 t1 = new MyThread2();
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
