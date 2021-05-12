package com.careerit.cj.basics.switchexamples;

import java.util.Scanner;

public class DevelopCalcUsingSwitch {

	// Get input from user : num1, num2
	// 1. Add 2. Sub 3. Mul 4. Div 5. Mod 6.Exit

	public static void main(String[] args) {

		int num1, num2;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the num1: ");
			num1 = sc.nextInt();
			System.out.println("Enter the num2: ");
			num2 = sc.nextInt();
			System.out.println("------------- 1.Add 2.Sub 3.Mul 4.Div 5.Mod 6.Exit-------------------");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			case 6:
				System.exit(0);

			default:
				System.out.println("Please enter choice 1-6 only try agin...");
			}
			System.out.println("Do you want to coninue: (1 - Continue 0 - Exit )");
			choice = sc.nextInt();
		} while (choice == 1);
		sc.close();
	}
}
