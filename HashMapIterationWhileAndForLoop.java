package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterationWhileAndForLoop {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(2, "saket");
		hm.put(25, "noor");
		hm.put(12, "hasim");
		System.out.println(hm.size());
		// using while loop
		System.out.println("with while loop");
		Iterator itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("key=" + me.getKey() + ",value=" + me.getValue());
		}
		// using for loop
		
		System.out.println("with for loop");
		for (Map.Entry me2 : hm.entrySet()) {
			System.out.println("key=" + me2.getKey() + ",value=" + me2.getValue());

		}

	}

}
