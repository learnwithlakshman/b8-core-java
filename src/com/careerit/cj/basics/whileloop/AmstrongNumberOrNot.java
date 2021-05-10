package com.careerit.cj.basics.whileloop;

public class AmstrongNumberOrNot {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 1_00_000) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum + (r * r * r);
				temp = temp / 10;
			}
			if (i == sum) {
				System.out.println(i);
			}
			i++;
		}

	}
}
