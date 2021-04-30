package com.careerit.cj.day4;

import java.util.Scanner;

public class CheckPrimeOrNot {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			
			boolean isPrime = true;
			
			for(int i=2;i<=num/2;i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(num +" is a prime");
			}else {
				System.out.println(num +" is not a prime");
			}
			sc.close();
		}
}
