package com.test;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicateNumber {

	public static void main(String[] args) {
		List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9);
		// List<Integer> listStream =
		// listNumber.stream().distinct().collect(Collectors.toList());
		Set<Integer> listStream2 = listNumber.stream()
				.filter(e -> Collections.frequency(listNumber, e) > 1)
				.collect(Collectors.toSet());
		System.out.println("without set object ="+listStream2);
		
		//or
		Set<Integer> set=new HashSet<>();
		Set<Integer> set1=listNumber.stream().filter(n->!set.add(n))
				.collect(Collectors.toSet());
	
		
		System.out.println("with creating set object ="+set1);
	}

}
