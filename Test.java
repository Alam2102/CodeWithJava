package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> withDupes = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);
		List<Integer> withOutDub = withDupes.stream().distinct().collect(Collectors.toList());
		System.out.println(withOutDub);

		String org = "noor";
		String withOutDub1 = Arrays.asList(org.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(withOutDub1);

		String[] array = { "Meta", "Apple", "Amazon", "Netflix", "Apple", // duplicate
				"Google", "Netflix" // duplicate
		};
		Object[] array1 = Arrays.stream(array).distinct().toArray();
		Arrays.stream(array1).forEach(System.out::println);
	}

}
