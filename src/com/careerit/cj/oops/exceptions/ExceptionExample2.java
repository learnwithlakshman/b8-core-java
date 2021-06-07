package com.careerit.cj.oops.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

		public static void main(String[] args) {
				
				
				int num1=0, num2=0;
				try(Scanner sc = new Scanner(System.in)) {
					System.out.println("Enter the num1:");
					num1 = sc.nextInt();
					System.out.println("Enter the num2:");
					num2 = sc.nextInt();
					int res = num1 / num2;
					System.out.println("Result :"+res);
				}			
				catch (ArithmeticException | InputMismatchException  e) {
					System.out.println("Please check your input values");
					e.printStackTrace();
				
				}catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("End of main method");
		}
}
