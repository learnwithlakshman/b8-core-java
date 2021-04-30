package com.careerit.cj.day4;

import java.util.Scanner;

public class MultiplicationOfTableInRange {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lb number : ");
			int lb = sc.nextInt();
			System.out.println("Enter the ub number : ");
			int ub = sc.nextInt();
			
			for(int i=lb;i<=ub;i++) {
				int num = i;
				for(int j=1;j<=10;j++) {
					System.out.println(num+" * "+ j+" = "+(num * j));
				}
				System.out.println("...........................");
			}
			
			sc.close();
					
		}
}
