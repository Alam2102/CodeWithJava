package com.test2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchPosition {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		// using binarySearch
		int position = Collections.binarySearch(numbers, 3);
		System.out.println("The Position of 3 is " + position);

	}
}
