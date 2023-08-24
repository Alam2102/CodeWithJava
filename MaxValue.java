package com.test;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxValue {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Noor");
		hm.put(2, "Pratik");
		hm.put(3, "Atul");
		hm.put(4, "Atul");
		hm.put(10, "Noor");
		hm.put(23, "Pratik");
		hm.put(22, "Noor");

		System.out.println("Maximum key=" + Collections.max(hm.keySet())+
				", Maximum values=" + Collections.max(hm.values()));
		//System.out.println("Maximum values=" + Collections.max(hm.values()));

		Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();

		//System.out.println(hm);
	}

}
