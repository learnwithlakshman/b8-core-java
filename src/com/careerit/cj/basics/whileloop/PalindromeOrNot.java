package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class PalindromeOrNot {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num :");
			int num = sc.nextInt();
			
			int temp = num;
			
			int rev = 0;
			while(temp != 0) {
				int r = temp % 10;
				rev = rev * 10 + r;
				temp = temp / 10;
			}
			
			if(num == rev) {
				System.out.println(num+" is a palindrome");
			}else {
				System.out.println(num+" is not a palindrome");
			}
			sc.close();
		}
}
