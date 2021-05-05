package com.careerit.cj.basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateNEvenRandomNumbers {

	public static void main(String[] args) {
		// N Even random number in range 1001 to 2000
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		for(int i=1;i<=N;) {
			int num = ThreadLocalRandom.current().nextInt(1001,2000);
			if(num % 2 == 0) {
				i++;
				System.out.println(num);
			}
		}
		sc.close();
	}
}
