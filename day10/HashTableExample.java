package com.day10;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new Hashtable<>();
		
		hm.put(1, "Raja");
		hm.put(4, "Siva");
		hm.put(33, "Swe");
		
		System.out.println(hm);
		
		hm.put(1, "Praveen");
		System.out.println(hm);
		
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.get(33));
		
		System.out.println(hm.size());
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsValue("Raja"));
		System.out.println(hm.isEmpty());
		
		// Way-1
		
		Set<Integer> k = hm.keySet();
		for(Integer ks : k ) {
			System.out.println(ks + " => " +hm.get(ks));
		}
		
		Iterator<Integer> it = k.iterator();
		while(it.hasNext()) {
			Integer ks =it.next();
			System.out.println(ks + " => " +hm.get(ks));
		}
		
		// Way-2
		
		Set<Entry<Integer,String>> en =  hm.entrySet();
		System.out.println(en);
		for(Entry<Integer,String> i : en) {
			System.out.println(i.getKey() + " = " + i.getValue());
		}
		
		Iterator<Entry<Integer,String>> it1 = en.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> i = it1.next();
			System.out.println(i.getKey() + " = " + i.getValue());
			
		}
		
	}

}
