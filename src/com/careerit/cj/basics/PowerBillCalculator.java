package com.careerit.cj.basics;

import java.util.Scanner;

public class PowerBillCalculator {

		public static void main(String[] args) {
			// Min bill = 50
			// unit 1 - 100 : 1
			// 101 - 200    : 2
			// >200          : 5

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of used units :");
			int units = sc.nextInt();
			int unitPrice=0;
			
			int minAmount = 50;
			
			if(units >=1 && units<100) {
				unitPrice = 1;
			}else if(units >= 100 && units <200) {
				unitPrice = 2;
			}else if(units >= 200) {
				unitPrice = 5;
			}
			
			int billAmount = unitPrice * units + minAmount;
			System.out.println("Used units     :"+units);
			System.out.println("Price for unit :"+unitPrice);
			System.out.println("Min amount     :"+minAmount);
			System.out.println("Total bill     :"+billAmount);
			sc.close();
		}
}
