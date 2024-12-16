package com.day7;


class MyThrad extends Thread{
	public void run(){
		for(int i = 0; i <=5;i++) {
			System.out.println("Thread running ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class MultiThreading {
	public static void main(String ar[]) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setPriority(6);
		t.setName("Raja");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		
		
		
	}

}
