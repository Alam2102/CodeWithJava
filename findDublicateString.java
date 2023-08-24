package com.test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDublicateString {
	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("AA", "BB", "AA", "CC");
		Set<String> set1=new HashSet<>();
		Set<String> set=namesList.stream().filter(n->!set1.add(n)).collect
				(Collectors.toSet());
		System.out.println(set);
		
		
		Map<String, Long> set2=namesList.stream()
				.filter(e->Collections.frequency(namesList, e)>1)
				.collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		
		System.out.println(set2);
	}

}
