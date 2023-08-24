package com.test;

public class VowelConsonentDigitwhitespace {
	public static void main(String[] args) {
		findVowelConsonent("this is my 2nd Test");

	}

	public static void findVowelConsonent(String str) {
		int vowels = 0, consonent = 0, digits = 0, whitespaces = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowels++;
			} else if (Character.isWhitespace(str.charAt(i))) {
				whitespaces++;

			} else if (Character.isDigit(str.charAt(i))) {
				digits++;

			} else {
				consonent++;
			}
		}
		System.out.println("vowels "+vowels);
		System.out.println("whitespace "+whitespaces);
		System.out.println("digits "+digits);
		System.out.println("consonent "+consonent);
		

	}

}
