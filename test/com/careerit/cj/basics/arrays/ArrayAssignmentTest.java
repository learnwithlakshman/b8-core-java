package com.careerit.cj.basics.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayAssignmentTest {

	
	private ArrayAssignment obj;
	
	@BeforeEach
	void beforeEach() {
		obj = new ArrayAssignment();
	}
	
	@Test
	@DisplayName("Occurance of key with existing key")
	void occuranceOfKeyWithValidKey() {
		int[] inputArr = {1,2,3,4,5,6,7,8,1,2,3,5,4,5};
		int key = 5;
		int expected = 3;
		int acutal = obj.occuranceOfKey(inputArr, key);
		assertEquals(expected, acutal);
	}
	@Test
	@DisplayName("Occurance of key with out existing key")
	void occuranceOfKeyWithoutValidKey() {
		int[] inputArr = {1,2,3,4,5,6,7,8,1,2,3,5,4,5};
		int key = 15;
		int expected = 0;
		int acutal = obj.occuranceOfKey(inputArr, key);
		assertEquals(expected, acutal);
	}
	@Test
	@DisplayName("Occurance of key with null array")
	void occuranceOfKeyWithNullArray() {
		int[] inputArr = null;
		int key = 15;
		int expected = 0;
		int acutal = obj.occuranceOfKey(inputArr, key);
		assertEquals(expected, acutal);
	}
	@Test
	@DisplayName("Occurance of key with empy array")
	void occuranceOfKeyWithEmptyArray() {
		int[] inputArr = {};
		int key = 15;
		int expected = 0;
		int acutal = obj.occuranceOfKey(inputArr, key);
		assertEquals(expected, acutal);
	}
}
