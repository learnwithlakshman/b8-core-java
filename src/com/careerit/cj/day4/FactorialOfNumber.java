package com.careerit.cj.day4;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int N = sc.nextInt();
		int res = 1;
		for (int i = 2; i <= N; i++) {
			res *= i;
		}
		System.out.println("Factorial of :"+N+" is : "+res);
		sc.close();
	}
}
