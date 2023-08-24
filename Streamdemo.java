package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 10, 2, 45, 15, 3, 8, 9, 14, 13, 46, 32, 21);

		// Ascending order
		Collections.sort(list, (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0);
		// list.stream().forEach(System.out::println);

		// Descending order
		Collections.sort(list, (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0);
		// list.stream().forEach(System.out::println);

		// even number
		List<Integer> evenNumber = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		//System.out.println(evenNumber);

		// Odd Number
		List<Integer> oddNumber = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		//System.out.println(oddNumber);

	}

}
