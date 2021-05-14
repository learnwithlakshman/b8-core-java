package com.careerit.cj.basics.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {

		@Test
		void linearSearchWithValidKeyTest() {
			
				ArrayOperations obj = new ArrayOperations();
				int[] inputArr = {2,5,10,22,25,21,89};
				int key = 22;
				int expected = 3;
				int actual = obj.linearSearch(inputArr, key);
				assertEquals(expected, actual);
		}
		@Test
		void linearSearchWithNotValidKeyTest() {
		
				ArrayOperations obj = new ArrayOperations();
				int[] inputArr = {2,5,10,22,25,21,89};
				int key = 99;
				int expected = -1;
				int actual = obj.linearSearch(inputArr, key);
				assertEquals(expected, actual);
		}
		@Test
		void linearSearchWithEmptyArrayKeyTest() {
			
				ArrayOperations obj = new ArrayOperations();
				int[] inputArr = {};
				int key = 99;
				int expected = -1;
				int actual = obj.linearSearch(inputArr, key);
				assertEquals(expected, actual);
		}
		@Test
		void linearSearchWitNullArrayKeyTest() {
				ArrayOperations obj = new ArrayOperations();
				int[] inputArr = null;
				int key = 99;
				int expected = -1;
				int actual = obj.linearSearch(inputArr, key);
				assertEquals(expected, actual);
		}
		
		@Test
		void maxElementWithPNumbers() {
			ArrayOperations obj = new ArrayOperations();
			int[] inputArr = {2,5,100,22,25,21,89};
			int expected = 100;
			int actual = obj.maxElement(inputArr);
			assertEquals(expected,actual);
		}
}
