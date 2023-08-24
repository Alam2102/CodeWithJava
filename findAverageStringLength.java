package com.test;

import java.util.Arrays;
import java.util.List;

public class findAverageStringLength {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
		System.out.println("List of colors:" + colors);

		double averageLength = calculateAverageLength(colors);
		System.out.println("Average Length of the color:" + averageLength);
	}

	private static double calculateAverageLength(List<String> colors) {
		return colors.stream().mapToInt(String::length).average().orElse(0);
	}
}
