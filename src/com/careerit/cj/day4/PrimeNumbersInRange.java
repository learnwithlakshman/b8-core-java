package com.careerit.cj.day4;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb number : ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub number : ");
		int ub = sc.nextInt();

		for (int l = lb; l <= ub; l++) {
			int num = l;

			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num+" ");
			}
		}
		sc.close();
	}
}
