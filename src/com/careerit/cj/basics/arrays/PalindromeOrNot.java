package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PalindromeOrNot {

	public static void main(String[] args) {

		for (int l = 1; l < 100; l++) {
			int[] arr = getArrayElements(5);
			boolean flag = true;
			for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
				if (arr[i] != arr[j]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(Arrays.toString(arr) + " is a Palindrome");
			} else {
				System.out.println(Arrays.toString(arr) + " is not a Palindrome");
			}

		}
	}

	private static int[] getArrayElements(int n) {

		int[] randomArr = new int[n];
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = ThreadLocalRandom.current().nextInt(1, 5);
		}
		return randomArr;
	}

}
