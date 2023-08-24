  package com.test;


import java.util.function.Predicate;

public class PalindromeTest {
	public static void main(String[] args) {
		String str1 = "radar";
		String str2 = "Radar";

		Predicate<String> isPalindrome = str -> {
			String reverse = new StringBuffer(str).reverse().toString();
			return str.equals(reverse);
		};

		boolean isPalindromeTest = isPalindrome.test(str1);
		System.out.println(isPalindromeTest);

		boolean isPalindromeTest1 = isPalindrome.test(str2);
		System.out.println(isPalindromeTest1);

	}

}
