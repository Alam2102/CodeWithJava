package com.demo;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {

		// here we are having array already in sorted order
		int a[] = { 4, 5, 7, 31, 45, 60 };
		BubbleSort1 bsort = new BubbleSort1();
		bsort.bubbleSort(a);
	}

	public void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			// with the use of isSortArray,not iterating the complete loop
			// first for loop sort with 0 index
			boolean isSortedArray = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {// here we comparing the position.
					// with the use of isSortArray as false it is not entering
					// inside the if block,entering into if block means going to swap
					// the number and swap means sorting the number.
					isSortedArray = false;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (isSortedArray)
				break;
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
