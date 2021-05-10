package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class SumofDigitsUnitlSumGetsSingleDigitNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num :");
			int num = sc.nextInt();
			int temp = num;
			
			while(temp > 9) {
				temp = temp / 10 + temp % 10;
			}
			
			System.out.println("The single digit sum of "+num +" is "+temp);
			sc.close();
			
		}
}
