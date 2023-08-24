package com.test2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author MD NOOR ALAM
 *
 */
public class findStringCount {
	public static void main(String[] args) {
		String sentence = "The cat has black fur and black eyes";
		String[] word = sentence.trim().split("\\s+");
		Map<String, Long> mapCounts = Arrays.stream(word)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(mapCounts);
	}

}
