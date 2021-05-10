package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();

		int i = 1;
		int res = 1;

		while (i <= num) {
			res *= i;
			i++;
		}
		System.out.println("Factorial of :"+num+" is "+res);
		sc.close();
	}
}
