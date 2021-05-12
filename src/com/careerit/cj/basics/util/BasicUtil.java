package com.careerit.cj.basics.util;

public class BasicUtil {

	public static void showElements(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length-1)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[i]);
		}
		System.out.print("]");
	}
}
