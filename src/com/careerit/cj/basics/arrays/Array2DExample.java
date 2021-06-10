package com.careerit.cj.basics.arrays;

public class Array2DExample {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 } };

//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

		for (int[] ele : arr) {
			for (int e : ele) {
				if (e == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
