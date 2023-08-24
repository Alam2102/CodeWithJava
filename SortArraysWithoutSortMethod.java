package com.test;

import java.util.Arrays;
import java.util.List;

public class SortArraysWithoutSortMethod {

	public static void main(String[] args) {
		int[] arr = new int[] { 21, 15, 19, 23, 20, 22, 17, 18, 25, 16, 24 };
		//@SuppressWarnings("unused")
		//List<Integer> arrayList=Arrays.asList(21, 15, 19, 23, 20, 22, 17, 18, 25, 16, 24);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(" " + arr[i]);
		}
	}

}
