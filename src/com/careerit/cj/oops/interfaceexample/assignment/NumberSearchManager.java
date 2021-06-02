package com.careerit.cj.oops.interfaceexample.assignment;

interface ElementSearch {
	int search(int[] arr, int ele);
}

class BinarySearch implements ElementSearch {

	@Override
	public int search(int[] arr, int ele) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class LinearSearch implements ElementSearch {

	@Override
	public int search(int[] arr, int ele) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class UserData {

	private ElementSearch elementSearch;
	public UserData() {
		this.elementSearch = new BinarySearch();
		//this.elementSearch = new LinearSearch();
	}

	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 23, 45, 65, 78, 12, 13, 11, 15 };

	int search(int key) {
		return elementSearch.search(arr, key);
	}
}

public class NumberSearchManager {

	public static void main(String[] args) {
		UserData obj = new UserData();
		int res = obj.search(10);
		if (res == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at :" + res);
		}
	}
}
