package com.careerit.cj.basics.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class NumberOperationsTest {

	@Test
	void isPrimeWithPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 37;
		assertTrue(obj.isPrime(num));
	}
	@Test
	void isPrimeWithNotPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 33;
		assertFalse(obj.isPrime(num));
	}
	
	@Test
	void isPrimeWithEvenPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 2;
		assertTrue(obj.isPrime(num));
	}
	@Test
	void isPrimeWithNNumberTest() {
		NumberOperations obj = new NumberOperations();
		int num = -37;
		assertFalse(obj.isPrime(num));
	}
	@Test
	void isPrimeWithZeroTest() {
		NumberOperations obj = new NumberOperations();
		int num = 0;
		assertFalse(obj.isPrime(num));
	}
	@Test
	void isPrimeWithOneTest() {
		NumberOperations obj = new NumberOperations();
		int num = 1;
		assertFalse(obj.isPrime(num));
	}
	
	@Test
	void primeCountInRangeTest() {
			int lb = 1;
			int ub = 20; // 2 3 5 7 11 13 17 19
			int expected = 8;
			NumberOperations obj = new NumberOperations();
			int actual = obj.countPrimesInRange(lb, ub);
			assertEquals(expected, actual);
	}
	
	@Test
	void primeCountInFalseRangeTest() {
			int lb = 20;
			int ub = 1; 
			int expected = 0;
			NumberOperations obj = new NumberOperations();
			int actual = obj.countPrimesInRange(lb, ub);
			assertEquals(expected, actual);
	}
	
	@Test
	void primeCountInNNumberRangeTest() {
			int lb = -10;
			int ub = -20; 
			int expected = 0;
			NumberOperations obj = new NumberOperations();
			int actual = obj.countPrimesInRange(lb, ub);
			assertEquals(expected, actual);
	}
	
	@Test
	void getPrimesInRangeTest() {
			NumberOperations obj = new NumberOperations();
			int[] expected = {2,3,5,7,11,13,17,19};
			int[] actual = obj.getPrimesInRange(1, 20);
			System.out.println(Arrays.toString(actual));
			assertArrayEquals(expected, actual);
			
	}
	
	
}
