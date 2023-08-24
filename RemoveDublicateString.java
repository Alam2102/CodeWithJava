package com.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateString {
	public static void main(String[] args) {
		removeDublicateString("I am am so so cute what about about u u ");
		
		
		String orignalString = "world world";

		String output = Arrays.asList(orignalString.split(""))
								.stream()
								.distinct()
								.collect(Collectors.joining());

		//System.out.println("Original String : " + orignalString);
		//System.out.println("After removing the duplicates : " + output);

	}

	public static void removeDublicateString(String str) {
		List<String> list = Arrays.asList(str.split(" "));
		LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
		for (String s : lhs) {
			System.out.print(s + " ");
		}
	}

}
