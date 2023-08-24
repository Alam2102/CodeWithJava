package com.demo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;

public class BubbleSortWithTimetaken {
	public static void main(String[] args) {
		// here we are having array already in sorted order
		int a[] = { 4, 5, 7, 31, 45, 60 };
		BubbleSortWithTimetaken bsort = new BubbleSortWithTimetaken();
		bsort.bubbleSort(a);

		bsort.display();
	}

	public void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {

			boolean isSortedArray = true;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					isSortedArray = false;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (isSortedArray)
				break;
		}

		// or using stream api
		// Arrays.stream(a).forEach(s -> System.out.print(s + " "));
	}

	public void display() {
		LocalDateTime startTime = LocalDateTime.now();
		for (int i = 0; i < 100000; i++) {
			System.out.println("Hi");
		}
		LocalDateTime endTime = LocalDateTime.now();
		Duration d = Duration.between(startTime, endTime);
		System.out.println("time taken for execution " + d.toMillis());
	}
}
