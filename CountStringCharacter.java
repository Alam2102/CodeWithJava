package com.test2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringCharacter {
	public static void main(String[] args) {
		String s = "string data to count each character";

		Map<String,Long> map=Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new,
						Collectors.counting()));
		
		System.out.println(map);
	}

}
