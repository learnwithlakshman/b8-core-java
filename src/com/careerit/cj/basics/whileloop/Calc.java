package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		int choice = 0;
		do {
			int res;
			System.out.println("1. Add 2. Mul 3.Div 4. Mod 5.Exit");
			System.out.println("Enter the choice: ");
			int ch = sc.nextInt();
			if (ch == 1) {
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);

			} else if (ch == 2) {
				res = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + res);
			} else if (ch == 3) {
				res = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + res);
			} else if (ch == 4) {
				res = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + res);
			} else if (ch == 5) {
				System.exit(0);
			}

			System.out.println("Do you want (1 continue or 0 exit)");
			choice = sc.nextInt();
		} while (choice == 1);
		sc.close();
	}
}
