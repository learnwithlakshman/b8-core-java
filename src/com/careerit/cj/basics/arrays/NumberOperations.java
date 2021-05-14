package com.careerit.cj.basics.arrays;

import java.time.LocalDateTime;

public class NumberOperations {

	
	// Check given number is prime
	// Count number of primes in the given range
	// Get all prime numbers in the given range 2 20 [2,3,5,7,11,13,17]

	public boolean isPrime(int num) {
		if (num < 2 || (num % 2 == 0 && num != 2))
			return false;
		for (int i = 2; i <= (int)Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int countPrimesInRange(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public int[] getPrimesInRange(int lb, int ub) {
		int n = countPrimesInRange(lb, ub);
		int[] arr = new int[n];
		int j = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				arr[j++] = i;

			}
		}
		return arr;
	}

	
}
