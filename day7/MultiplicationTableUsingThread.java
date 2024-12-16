package com.day7;


class twoTable implements Runnable{
	public void run(){
		
		for(int i = 1; i<=10;i++) {
			System.out.println(i+" * 2 = "+(i*2));
		}
		
	}
}
class fiveTable implements Runnable{
	public synchronized void run(){
		
		for(int i = 1; i<=10;i++) {
			System.err.println(i+" * 5 = "+(i*5));
		}
		
	}
}

public class MultiplicationTableUsingThread {

	public static void main(String[] args) {
		
		Thread t = new Thread(new twoTable());
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {

		}
		Thread t1 = new Thread(new fiveTable());
		t1.start();
		
		

	}

}
