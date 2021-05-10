package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num :");
			int num = sc.nextInt();
			int temp = num;
			
			int sum = 0;
			while(temp != 0) {
				int r = temp % 10;
				sum = sum + r;
				temp = temp / 10; 
			}
			System.out.println("The sum of digits of :"+num+" is "+sum);
			sc.close();
			
		}
}
