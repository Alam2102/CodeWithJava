package com.test;

public class PrimeNumberTest2 {
	public static void main(String[] args) {

		int limit = 100;
		//boolean isPrime = false;

		for (int i = 1; i < 100; i++) {
			boolean isPrime = false;
			for (int j = 2; j <i; j++) {
				if (i % j == 0) {
					isPrime = true;
					break;
				}

			}
			if (!isPrime)
				System.out.println(i + " is a prime number");
			else
				System.out.println(i + " is not a prime number");

		}

	}

}
