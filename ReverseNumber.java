package com.test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {
	public static void main(String[] args) {
		// sort with reverse
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		Stream<Integer> stream = Stream.of(5, 7, 2, 5, 6, 12, 10, 13, 17);
		List<Integer> list1 = stream.collect(Collectors.toList());
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
