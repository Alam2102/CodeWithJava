package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareFilterAverage {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100, 24, 13, 44, 114, 200, 40, 112);
		OptionalDouble listOut = list.stream().mapToInt(n -> n * n)
				.filter(n -> n > 10000).average();

		if (listOut.isPresent()) {
			System.out.println(listOut.getAsDouble());
		}
	}

}
