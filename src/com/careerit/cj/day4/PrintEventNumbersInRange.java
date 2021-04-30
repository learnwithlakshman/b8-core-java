package com.careerit.cj.day4;

import java.util.Scanner;

public class PrintEventNumbersInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb number : ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub number : ");
		int ub = sc.nextInt();

		for (int i = lb; i <= ub; i++) {
			
			 if(i % 2 != 0) {
				 System.out.print(i+" ");
			 }
			
		}

		sc.close();
	}
}
