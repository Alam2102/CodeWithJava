package com.test2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntegerReturnTrueIfDubElseFalse {
	public static void main(String[] args) {
		int[] num= {1,2,3,1}; //return true
		//int[] num= {1,2,3,4}; return false
		System.out.println(containDublicate(num));

	}

	public static boolean containDublicate(int[] num) {

		List<Integer> list = Arrays.stream(num).boxed()
				.collect(Collectors.toList());

		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;

		}
		return true;
	}
}
