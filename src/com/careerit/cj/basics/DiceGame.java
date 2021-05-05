package com.careerit.cj.basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

	public static void main(String[] args) {

		// 1,2,3,4,5,6
		int num = ThreadLocalRandom.current().nextInt(1, 6);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Guess a number :(1-6)");
			int gnumber = sc.nextInt();
			if (num == gnumber) {
				System.out.println("Congratulation... you guessed number in :"+i+" attempts");
				break;
			} else {
				if(i==3) {
					System.out.println("Sorry! you have reached max number attempts. better luck next time");
				}else {
					System.out.println("Sorry! try agin...");
				}
			}
		}
		sc.close();

	}
}
