package com.test2;

public class PlaindromeNumber {
	public static void main(String[] args) {
		int num = 3553, reverseNum = 0, remainder;
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;

		}
		if (originalNum == reverseNum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palinldrome");
		}
	}

}
