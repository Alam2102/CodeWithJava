package com.test;

import java.util.HashMap;

public class DublicateCharacter {

	public static void main(String[] args) {
		findDublicateCharacter("findDublicateCharacter");

	}

	public static void findDublicateCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

	}

}
