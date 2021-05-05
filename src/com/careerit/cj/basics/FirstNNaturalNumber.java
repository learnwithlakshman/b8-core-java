package com.careerit.cj.basics;

import java.util.Scanner;

public class FirstNNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();

//		for (int i = 1; i <= N; i++) {
//			System.out.print(i+" ");
//    	}
//		for (int i = N; i >= 1; i--) {
//			System.out.print(i+" ");
//		}

		// Print even numbers <= N

//		for (int i = 2; i <= N; i=i+2) {
//				System.out.print(i+" ");
//		}

		// Print odd numbers <= N

//		for(int i=1;i<=N;i = i + 2) {
//				System.out.print(i+" ");
//				
//		}

		// Print all numbers which are divisible by 3 and 6 but not 9 <=N
		for (int i = 1; i <= N; i++) {
			if(i % 3 == 0 && i % 6 == 0 && i % 9 !=0) {
				System.out.print(i+" ");
			}
				
		}
		
		// 1 5
		// 2 4
		// 3 3
		// 4 2 
		// 5 1
		
		int arr[] = {1,2,3,2,1};
		boolean flag = true;
		for(int i=0,j=arr.length-1;i<=j;i++,j--) {
			
			if(arr[i] != arr[j]) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
		
		
		
		sc.close();
	}
}
