package com.test;

import java.util.stream.IntStream;

public class findLargestprimefactor {
	public static void main(String[] args) {

		int n = 176;

		int primefactor = findLargestPrimeFactor(n);
		System.out.println(primefactor);
	}

	private static int findLargestPrimeFactor(int n) {
		for (int i = (int) Math.sqrt(n); i >= 2; i--) {
			if (n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return n;
	}

	private static boolean isPrime(int num) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(num))
				.allMatch(n -> num % n != 0);

	}

}
