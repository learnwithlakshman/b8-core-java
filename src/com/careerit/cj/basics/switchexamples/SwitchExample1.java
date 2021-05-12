package com.careerit.cj.basics.switchexamples;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Withdraw 2.Statement 3.Change password 4.Exit");
		char ch = 'a'; // ASCII => 97

		switch (ch++) {

		case 97:
			System.out.println("Withdraw");
			break;
		case 98:
			System.out.println("Statement");
			break;
		case 96:
			System.out.println("Change password");
			break;
		default:
			System.out.println("Exit");

		}
		System.out.println(ch);
	}
}
