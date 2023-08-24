package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		Character c = getNONRepeatingCharacter("SASAS");
		// System.out.println("Non Reapeting character is : " + c.toString());

		Optional<Character> cOptional = getNONRepeatingCharacterOptional("SASAS");
		if (cOptional.isPresent()) {
			System.out.println("Non Reapeting character is : " + cOptional.toString());

		} else {
			System.out.println("No non repeated character found in String");
		}
	}

	// without using Optional class to avoid nullpointerException
	public static Character getNONRepeatingCharacter(String str) {
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character ch = str.charAt(i);
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, hm.get(ch) + 1);
			}
		}

		for (Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;
	}

	// with the use Optional class to avoid NullpointerException
	public static Optional<Character> getNONRepeatingCharacterOptional(String str) {
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character ch = str.charAt(i);
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, hm.get(ch) + 1);
			}
		}

		for (Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() == 1)
				return Optional.of(e.getKey());

		}
		return Optional.ofNullable(null);
	}

}
