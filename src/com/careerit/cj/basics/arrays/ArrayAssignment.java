package com.careerit.cj.basics.arrays;

public class ArrayAssignment {

	public int[] rotate(int[] arr, int n) {

		return null;
	}

	public boolean search(int[] master, int[] child) {

		return false;
	}

	public int[] getMinAndMax(int[] arr) {

		return null;
	}

	public int occuranceOfKey(int[] arr, int key) {
		int count = 0;
		if (arr != null && arr.length != 0) {
			for (int ele : arr) {
				if (ele == key) {
					count++;
				}
			}
		}
		return count;
	}
}
