package com.test;

import java.util.function.Predicate;

public class PrimeNumberTest {
	public static void main(String[] args) {

		Predicate<Integer> isPrime = n -> {
			if (n <= 0) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};

		boolean isPrimeTest1 = isPrime.test(17);
		System.out.println(isPrimeTest1);

		boolean isPrimeTest2 = isPrime.test(22);
		System.out.println(isPrimeTest2);

	}

}
