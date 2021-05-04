package com.careerit.cj.basics;

import java.util.Scanner;

public class ConvertDayToYearsAndMonths {
	
		// day = 800  => 2 Year x months y day
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of days :");
			long days = sc.nextLong();
			
			long years    =   days / 365;
			long months   =   (days % 365) / 30;
			long calDays  =   (days % 365) % 30;
			
			System.out.println(years+" Years "+months+" Months "+calDays+" Days");
			sc.close();
			
				
	}

}
