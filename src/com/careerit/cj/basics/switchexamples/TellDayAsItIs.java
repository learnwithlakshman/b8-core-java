package com.careerit.cj.basics.switchexamples;

import java.util.Scanner;

public class TellDayAsItIs {
	// Day number

	// 1 - 7
	// 1 Mondays are bad
	// 2,3,4,5 Weekdays are ok
	// 6, 7 Weekends are Good
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number (1-7) only: ");
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Mondays are bad");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday are ok");
			break;
		case 6:
		case 7:
			System.out.println("Weekends are good");
			break;
		default:
			System.out.println("You are in wrong place....");
		}
		sc.close();
	}
}
