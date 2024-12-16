package com.day7;


class MyThread extends Thread{
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

public class MyThread1 {
	// @SuppressWarnings("removal")
	public static void main(String ar[]) {
		
		//Thread t = Thread.currentThread();
		MyThread t1 = new MyThread();
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// t1.interrupt();
		
		System.out.println("Main thread ");
		
		
	}

}
