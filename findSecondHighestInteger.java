package com.test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findSecondHighestInteger {

	public static void main(String[] args) {
		/*
		 * int[] array = { 2, 4, 6, 8, 10, 12, 14, 16 }; findSecondHighest(array);
		 * 
		 * }
		 * 
		 * public static int findSecondHighest(int[] array) { int highest =
		 * Integer.MIN_VALUE; int secondHighest = Integer.MIN_VALUE;
		 * 
		 * for (int i : array) { if (i > highest) { secondHighest = highest; highest =
		 * i; } else if (i > secondHighest) { secondHighest = i;
		 * 
		 * }
		 * 
		 * } System.out.println(secondHighest); return secondHighest;
		 * 
		 * }
		 */

		List<Integer> array = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
		int secondHighestNumber = array.stream()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighestNumber);

	}

}
