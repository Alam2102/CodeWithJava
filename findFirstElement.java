package com.test2;

import java.util.Arrays;
import java.util.List;

//find first elemnt from the list
public class findFirstElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().findFirst().ifPresent(System.out::println);
		long count = myList.stream().count();
		System.out.println(count);

		// find maximum element from the list
		List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int max = myList2.stream().max(Integer::compare).get();
		System.out.println(max);

	}

}
