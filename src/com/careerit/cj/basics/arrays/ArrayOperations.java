package com.careerit.cj.basics.arrays;

public class ArrayOperations {

	// If key is found in the given it return index of the element otherwise return
	// -1
	public int linearSearch(int[] arr, int key) {
		if (arr == null || arr.length == 0)
			return -1;
		// Logic key is found return index value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public int maxElement(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int binarySearch(int[] arr) {
		return -1;
	}

	public int[] sort(int arr[]) {

		return null;
	}
}