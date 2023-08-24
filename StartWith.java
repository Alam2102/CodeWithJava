package com.test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {

	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(10,16,8,49,25,98,32);
		myList.stream().map(s->" "+s).filter(s->s.startsWith("1")).forEach(System.out::println);
		
	}
}
