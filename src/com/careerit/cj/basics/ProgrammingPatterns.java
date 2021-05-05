package com.careerit.cj.basics;

import java.util.Scanner;

public class ProgrammingPatterns {
	public static void main(String[] args) {
		// N = 5
//		   *
//		   * *
//		   * * *
//		   * * * *
//		   * * * * *
//		   * * * *
//		   * * *
//		   * * 
//		   *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=N-1;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
		// Print      
	}
}
