package com.demo;

public class BinarySearchImpl {

	public static void main(String[] args) {
		int a[] = { 1, 5, 15, 21, 31, 54, 95, 100 };

		BinarySearchImpl search = new BinarySearchImpl();
		search.binarySearch(a, 95);

		//int a1[] = new int[Integer.MAX_VALUE];
		int l = 10000;
		int h = 2147483647;
		int m = (l + h) / 2;
		System.out.println(m);
		//a[-1073736824]--here index is getting in negative 
		// and index can't be negative,so this problem is called overflow issue.
		int m1=l+(h-l)/2;//this is the formula.we are going to use to find out the middle index 
	      m1=10000+(2147483647-10000)/2;
		  System.out.println(m1);

	}
    
	public void binarySearch(int[] a, int elementToFind) {
		int iteration = 0;
		int l = 0;
		int h = a.length - 1;
		while (l < h) {
			iteration++;
			int m = (l + h) / 2;
			if (a[m] == elementToFind) {
				System.out.println("Element is found at position " + m + " in " + iteration + " iteration");
			}
			if (a[m] < elementToFind) {
				l = m + 1;
			} else {
				h = m;
			}
		}
	}

}
