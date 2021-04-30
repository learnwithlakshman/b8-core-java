package com.careerit.cj.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2: ");
			int num2 = sc.nextInt();
			
			if(num1 > num2) {
				System.out.println("Num1 is big :"+num1);
			}else if(num2 > num1) {
				System.out.println("Num2 is big :"+num2);
			}else {
				System.out.println("Num1 and Num2 are equal");
			}
			
			System.out.println("...............");
			sc.close();
		}
}
