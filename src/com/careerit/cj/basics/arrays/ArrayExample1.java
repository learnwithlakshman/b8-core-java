package com.careerit.cj.basics.arrays;

public class ArrayExample1 {

	public static void main(String[] args) {

		// int[] arr = new int[10];
		// int[] arr = new int[] {1,2,3,4,5,6};
		int[] arr = { 101, 201, 199, 185, 165, 456, 345, 245, 230 };

		// Display all the elements of the arrary
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Display array element in reverse order
		System.out.println("-----------------------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		// Print only first 3 array element 
		
		System.out.println("----------------------------");
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		
		// Print only last 3 array element
		
		System.out.println("----------------------------");
		for(int i=arr.length-1;i>arr.length-4;i--) {
			System.out.println(arr[i]);
		}
		
		// Print element of an array ( exclude first and last 2 elements)
		System.out.println("-------------------------");
		for(int i=2;i<arr.length-2;i++) {
			System.out.println(arr[i]);
		}

		// Java5 forEach
		System.out.println("----------- Using for each---------------");
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
