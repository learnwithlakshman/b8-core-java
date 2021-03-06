package com.careerit.cj.basics.arrays;

import static org.junit.Assert.assertArrayEquals;
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
		
		@Test
		void sortPNumberTest() {
			ArrayOperations obj = new ArrayOperations();
			int[] inputArr = {2,5,4,3,6,1};
			int[] expected = {1,2,3,4,5,6};
			int[] actual = obj.sort(inputArr);
			assertArrayEquals(expected,actual);
		}
		@Test
		void sortNNumberTest() {
			ArrayOperations obj = new ArrayOperations();
			int[] inputArr = {-2,-5,-4,-3,-6,-1};
			int[] expected = {-6,-5,-4,-3,-2,-1};
			int[] actual = obj.sort(inputArr);
			assertArrayEquals(expected,actual);
		}
		@Test
		void binaraySearchWithKey() {
			ArrayOperations obj = new ArrayOperations();
			int[] input =  {2,3,5,7,11,12,13,15,17,18,19};
			int key = 17;
			int expected = 8;
			int actual = obj.binarySearch(input, key);
			assertEquals(expected, actual);
			
		}
		
		@Test
		void binaraySearchWithOutKey() {
			ArrayOperations obj = new ArrayOperations();
			int[] input =  {2,3,5,7,11,12,13,15,17,18,19};
			int key = 27;
			int expected = -1;
			int actual = obj.binarySearch(input, key);
			assertEquals(expected, actual);
			
		}

}
