package com.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateNumber {

	public static void main(String[] args) {

		Integer[] integ = new Integer[] { 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 2, 9, 9 };
		LinkedHashSet<Integer> list = new LinkedHashSet<>(Arrays.asList(integ));
		Integer[] numberWith = list.toArray(new Integer[] {});
		System.out.println(Arrays.asList(numberWith));
		
		
		// using java 8 features
		List<Integer> listString=Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 2, 9, 9);
		List<Integer> dubString=listString.stream().distinct().collect(Collectors.toList());
		System.out.println("List without duplicates: " +dubString);
	}

}
