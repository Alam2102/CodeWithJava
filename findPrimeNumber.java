package com.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findPrimeNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
		System.out.println(list.stream().filter(findPrimeNumber::isPrime).collect(Collectors.toList()));
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
