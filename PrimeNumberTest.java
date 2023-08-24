package com.test;

import java.util.function.Predicate;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}
		// if (!isPrime)
		// System.out.println(num + " is a prime number");
		// else
		// System.out.println(num + " is not a prime number");

//======================================================================
		// using Lambda expression
		Predicate<Integer> isPrime1 = n -> {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;

		};

		boolean isPrimeNumber = isPrime1.test(17);
		System.out.println(isPrimeNumber);

		boolean isPrimeNumber2 = isPrime1.test(22);
		System.out.println(isPrimeNumber2);
	}

}
