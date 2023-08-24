package com.test;

import java.util.HashMap;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "AAAABBBBBBCCDEEFFFFFGGGHHH";

		int len = str.length();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			Character ch = str.charAt(i);
			if (hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
			System.out.println(hm);
			
		}

		//HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (hm.get(ch) == 1) {

				//System.out.println("First non-repeating character=" + ch);
			}
		}

	}

}
