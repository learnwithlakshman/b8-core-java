package com.careerit.cj.oops.interfaceexample;



class PrimeNumberUtil implements PrimeGenerator {

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

public class InterfaceWithDefaultMethods {

	public static void main(String[] args) {
		PrimeGenerator obj = new PrimeNumberUtil();

	}
}
