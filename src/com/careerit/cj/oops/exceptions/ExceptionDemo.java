package com.careerit.cj.oops.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Main method started");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the count :");
			int count = sc.nextInt();
			String[] arr = new String[count];
			sc.nextLine();
			for (int i = 0; i < count; i++) {
				System.out.println("Enter the name :(" + (i + 1) + ")");
				arr[i] = sc.nextLine();
			}
			
			for (String name : arr) {
				try {
					System.out.println(name.substring(0, 3));
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("The name "+name+" too short :" + e);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check index values:" + e);
			try {
				
			}catch (Exception e1) {
				
			}
		}

		System.out.println("End of main method");
	}
}
