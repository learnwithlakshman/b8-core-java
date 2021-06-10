package com.careerit.cj.oops.interfaceexample;
public interface PrimeGenerator {
	public boolean isPrime(int num);

	public boolean isPalindrome(int num);

	public int countPrimes(int lb, int ub);

	default int[] generatePrime(int lb, int ub) {
		int[] arr = new int[countPrimes(lb, ub)];
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPalindrome(i)) {
				arr[count++] = i;
			}
		}
		return arr;
	}

	default int countPalindromes(int[] arr) {
		int count = 0;
		for (int ele : arr) {
			if (isPalindrome(ele)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isEven(int num) {
		return num % 1 == 0;
	}
	
	
	// Note Java 9 supports private static and private method in interface

}