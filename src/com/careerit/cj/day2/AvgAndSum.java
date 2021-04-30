package com.careerit.cj.day2;

import java.util.Scanner;

public class AvgAndSum {

		public static void main(String[] args) {
			// Take 3 people weights as input from the user and find sum and average
			
			float weight_1,weight_2,weight_3,sum,avg;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the weight of person 1: ");
			weight_1 = sc.nextFloat();
			System.out.println("Enter the weight of person 2: ");
			weight_2 = sc.nextFloat();
			System.out.println("Enter the weight of person 3: ");
			weight_3 = sc.nextFloat();
			
			sum = weight_1 + weight_2 + weight_3;
			avg = sum / 3;
			System.out.println("The sum of weights is :"+sum);
			System.out.println("The average weight :"+avg);
			sc.close();	
		}
}
