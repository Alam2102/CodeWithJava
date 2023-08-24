package com.test;

import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromeStringTest {
	public static void main(String[] args) {
		String org = "";
		String rev = "";
		System.out.println("Enter Palindrome String");
		Scanner sc = new Scanner(System.in);
		org = sc.next();
		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		// if (org.equals(rev))
		// System.out.println("This is Palindrome");
		// else
		// System.out.println("This is not Palindrome");

		
		
		// lambda expression for Palindrome
		Predicate<String> isPalindrome = str -> {
			String reverse = new StringBuffer(str).reverse().toString();
			return str.equals(reverse);

		};
		String word1 = "Madam";
		boolean isPalindrome1 = isPalindrome.test(word1);
		System.out.println(word1 + " is a Plidrome String=" + isPalindrome1);
		
		String word2="radar";
	    boolean isPalindrome2=isPalindrome.test(word2);
	    System.out.println(word2+" is a Plidrome String="+isPalindrome2);
	    
	    
	    String word3="defined";
	    boolean isPalindrome3=isPalindrome.test(word3);
	    System.out.println(word3+" is a Plidrome String="+isPalindrome3);
	}
}