package com.test2;

import java.util.Collections;
import java.util.HashMap;

public class findMaxKey {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Noor");
		hm.put(2, "Pratik");
		hm.put(3, "Atul");
		hm.put(4, "Atul");
		hm.put(10, "Noor");
		hm.put(23, "Pratik");
		hm.put(22, "Noor");

		int max = Collections.max(hm.keySet());
		//hm.entrySet().stream().filter(entry -> entry.getKey() == max).map(entry -> entry.getKey())
				//.forEach(System.out::println);;
		System.out.println(max);
	}

}
