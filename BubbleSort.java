package com.demo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int a[] = { 31, 5, 7, 45, 60, 4 };
		BubbleSort bsort = new BubbleSort();
		bsort.bubbleSort(a);
	}

	public void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				// value should be in sorting/increasing order so first element is
				// less than second element
				if (a[j] > a[j + 1]) {// here we comparing the position
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		// using for loop without stream api
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]);
		 * 
		 * }
		 */

		// or using stream api
		Arrays.stream(a).forEach(s -> System.out.print(s + " "));
	}
}
