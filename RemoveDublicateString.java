package com.test;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateString {
	public static void main(String[] args) {
		
		// using stream but remove dublicate with its character
		
		String originalString = "world world";
		String outputString = Arrays.asList(originalString.split(""))
				.stream().distinct().collect(Collectors.joining());

		System.out.println(outputString);

		
		
		removeDublicateString("I am am so so cute what about about u u ");
	}

	// other way for removing dublicates with each of the String
	
	public static void removeDublicateString(String str) {
		List<String> listString = Arrays.asList(str.split(" "));
		LinkedHashSet<String> lhs = new LinkedHashSet<>(listString);
		for (String string : lhs) {
			System.out.print(string + " ");
		}

	}
}
