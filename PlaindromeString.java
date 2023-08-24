package com.test2;

public class PlaindromeString {
	public static void main(String[] args) {
		String str = "RADAR", strRev = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			strRev = strRev + str.charAt(i);
		}
		if (str.equals(strRev)) {
			System.out.println("This is a Palindrome String");
		} else {
			System.out.println("This is not palindrome String");
		}

	}

}
