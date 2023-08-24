package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramCheck {
	public static void main(String[] args) {
		String source = "SILENT";
		String target = "LISTEn";

		boolean isAnagram = Stream.of(source.toLowerCase().split(""))
				.sorted()
				.collect(Collectors.joining())
				.equals(
						Stream.of(target.toLowerCase().split(""))
						.sorted()
						.collect(Collectors.joining()));

		System.out.println(isAnagram);
	}

}
