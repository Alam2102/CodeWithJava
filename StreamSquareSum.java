package com.test2;

import java.util.Arrays;
import java.util.List;

public class StreamSquareSum {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//int sum = myList.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
		int sum=myList.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
		System.out.println(sum);

	}

}
