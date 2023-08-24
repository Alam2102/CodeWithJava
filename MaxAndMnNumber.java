package com.test;


import java.util.Comparator;
import java.util.stream.Stream;

public class MaxAndMnNumber {
	public static void main(String[] args) {
		Integer maxNumber = Stream.of(3, 4, 2, 6, 8, 9, 7, 10)
				.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxNumber);
		
		Integer minNumber = Stream.of(3, 4, 2, 6, 8, 9, 7, 10)
				.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minNumber);
		
		
		String maxstr=Stream.of("H","T","D","I","J")
				.max(Comparator.comparing(String::valueOf)).get();
		System.out.println(maxstr);
		
		String minstr=Stream.of("H","T","D","I","J")
				.min(Comparator.comparing(String::valueOf)).get();
		System.out.println(minstr);
	}

}
