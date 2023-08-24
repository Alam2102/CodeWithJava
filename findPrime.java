package com.test2;

import java.util.function.Predicate;

public class findPrime {
	public static void main(String[] args) {

		Predicate<Integer> pred = n -> {
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

		boolean isprimeTest = pred.test(21);
		System.out.println(isprimeTest);

		boolean isprimeTest2 = pred.test(17);
		System.out.println(isprimeTest2);
	}

}
