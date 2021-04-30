package com.careerit.cj.day4;

import java.util.Scanner;

public class PrintFactorsOfGivenNumber {

		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the num :");
				int num = sc.nextInt();
				
				int count = 0;
				for(int i=1;i<=num;i++) {
					if(num % i == 0) {
						System.out.print(i+" ");
						count++;
					}
				}
				System.out.println("\nFactors count is :"+count);
				sc.close();
		}
}
