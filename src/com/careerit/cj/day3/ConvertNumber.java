package com.careerit.cj.day3;

import java.util.Scanner;

/**
 * 
 * @author learn
 * Accept number from the user; if entered number is negative convert into positive number and display
 */

public class ConvertNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num :");
			int num = sc.nextInt();
			
			if(num < 0) {
				num = -num;
			}
			System.out.println("Entered number is :"+num);
			sc.close();
			
		}
}
