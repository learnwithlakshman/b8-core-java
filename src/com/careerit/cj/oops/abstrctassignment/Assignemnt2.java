package com.careerit.cj.oops.abstrctassignment;

import java.util.Arrays;

abstract class NumberOperations {
	public abstract boolean isPrime(int num);

	public abstract int countPrime(int lb, int ub);

	public int[] generatePrime(int lb, int ub) {
	
		int count = countPrime(lb, ub);
		int[] arr = new int[count];
		int l = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				arr[l] = i;
			}

		}
		return arr;
	}
}
class PrimeNumbers extends NumberOperations{

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countPrime(int lb, int ub) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

public class Assignemnt2 {

		public static void main(String[] args) {
			NumberOperations obj = new PrimeNumbers();
			System.out.println(Arrays.toString(obj.generatePrime(10,100)));
		}
}
