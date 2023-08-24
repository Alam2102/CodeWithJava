package com.test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Ascending,Descending,even,odd
public class StreamTest {
	public static void main(String[] args) {

		// list of data
		List<Integer> list = Arrays.asList(20, 10, 2, 45, 15, 3, 8, 9, 14, 13, 46, 32, 21);

		// Ascending order with Stream
		Collections.sort(list, (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0);
		// list.stream().forEach(System.out::println);

		// Descending order with Stream
		Collections.sort(list, (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0);
		// list.stream().forEach(System.out::println);

		// Even number with stream
		List<Integer> listEven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(listEven);

		// Odd number with stream
		List<Integer> listOdd = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(listOdd);
	}

}
