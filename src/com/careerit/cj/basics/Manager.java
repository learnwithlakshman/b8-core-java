package com.careerit.cj.basics;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author learn
 * Version 1
 * This is first java program to discuss about comments
 */
public class Manager {
	
	/**
	 * Program execution starts with main method
	 * @param args
	 */
	
	public static void main(String[] args) {

		// List<Integer> list = Stream.of(1,2,3,4,5,6).collect(Collectors.toList());//
		// Generating first 6 numbers and assigning to list
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		/*int num = 1123;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num / 10;
			num = num / 10;
		}
		System.out.println("Reverse of number is :" + rev);
		*/

	}
}
