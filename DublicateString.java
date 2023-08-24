package com.test;

import java.util.HashMap;

public class DublicateString {
	public static void main(String[] args) {
		findDublicateString("I am am learning java");
		
	}

	public static void findDublicateString(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		for (String tm : s) {
			if (hm.get(tm) != null) {
				hm.put(tm, hm.get(tm) + 1);
			} else {
				hm.put(tm, 1);
			}
		}
		System.out.println(hm);

	}

}
