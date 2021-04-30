package com.careerit.cj.day2;

import java.util.Scanner;

public class SwappingTwoNumber {

		public static void main(String[] args) {
			int num1,num2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1:");
			num1 = sc.nextInt();
			System.out.println("Enter the num2:");
			num2 = sc.nextInt();
			
			System.out.println("Before swap num1 = "+num1+" and num2 = "+num2);
			
			//Logic to swap two numbers using temp variable
			
			//			int temp = num1;
			//			num1 = num2;
			//			num2 = temp;
			//			System.out.println("After swap num1 = "+num1+" and num2 = "+num2);
			
			//Logic to swap two numbers without temp variable
			
			num1 = num1 * num2;
			num2 = num1 / num2;
			num1 = num1 / num2;
			System.out.println("After swap num1 = "+num1+" and num2 = "+num2);
			sc.close();
		}
}
