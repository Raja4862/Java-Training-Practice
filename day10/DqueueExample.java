package com.day10;

import java.util.Deque;
import java.util.LinkedList;

public class DqueueExample {

	    public static void main(String[] args) {
	    	
	        Deque<Integer> q = new LinkedList<>();
	        
	        q.offerFirst(10);
	        q.offerLast(20);
	        q.offer(30);
	        q.offer(40);
	        
	        System.out.println(q);
	        
	        q.poll();
	        q.pollFirst();
	        q.pollLast();
	        
	        System.out.println(q);
	        
	        System.out.println(q.isEmpty());
	        
	        
}
}