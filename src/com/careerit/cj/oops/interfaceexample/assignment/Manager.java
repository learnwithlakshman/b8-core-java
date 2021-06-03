package com.careerit.cj.oops.interfaceexample.assignment;

import java.util.ArrayList;
import java.util.List;

import com.careerit.cj.oops.interfaceexample.PrimeGenerator;

class One implements PrimeGenerator{

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countPrimes(int lb, int ub) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Manager {

		public static void main(String[] args) {
			
				MathOperations obj = new MathOperationsImpl();
				obj.binararySearch(null, 0);
				obj.generatePrimes(1, 100);
				obj.sort(null);
				
				PrimeGenerator ele = new One();
				ele.generatePrime(10, 20);
				
			
		}
}
