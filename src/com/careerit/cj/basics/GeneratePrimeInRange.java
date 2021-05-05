package com.careerit.cj.basics;

import java.util.Scanner;

public class GeneratePrimeInRange {

	public static void main(String[] args) {
		
			// Generate first N prime numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		
		int count = 0;
		for(int i=2;;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			if(count == N) {
				break;
			}
		}
		sc.close();
		
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num % 2 == 0 && num != 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
