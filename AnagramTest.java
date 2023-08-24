package com.test;

import java.util.Arrays;

public class AnagramTest {
	public static void main(String[] args) {
		String s1 = "TEAM";
		String s2 = "MEAT";
		if (s1.length() != s2.length()) {
			System.out.println("This is not Anagram");
		} 
		else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch1));

			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch2);
			System.out.println(Arrays.toString(ch2));
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("This is Anagram");

			}
		}
	}
}
