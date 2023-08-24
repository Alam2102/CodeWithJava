package com.test;


import java.util.stream.IntStream;

public class FindLargestPrimeFactor {
	public static void main(String[] args) {
		int n = 176;
		System.out.println("Number:" + n);

		int largestPrimeFactor = findLargestPrimeFactor(n);
		System.out.println("Largest prime Factor :" + largestPrimeFactor);

		n = 36;
	    System.out.println("\nNumber:"+n);
	    largestPrimeFactor=findLargestPrimeFactor(n);
	    System.out.println("Largest prime Factor :" + largestPrimeFactor);
	}

	private static int findLargestPrimeFactor(int n) {
		for (int i = (int) Math.sqrt(n); i >= 2; i--) {
			if (n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return n;
	}

	private static boolean isPrime(int number) {

		return IntStream.rangeClosed(2, (int) Math.sqrt(number))
				.allMatch(n -> number % n != 0);
	}

}
