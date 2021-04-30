package com.careerit.cj.day2;

import java.util.Scanner;

/**
 * 
 * @author learn
 *  Write a program to accept the following details of an employee: empno, name and monthly salary; 
 *  calculate the yearly salary and display the result.
 */
public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empno :");
		String empno = sc.nextLine();
		System.out.println("Enter the salary :");
		float salary = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		
		
		float y_salary = salary * 12;
		
		System.out.println("Name            :"+name);
		System.out.println("Empno           :"+empno);
		System.out.println("Salary          :"+salary);
		System.out.println("Yearly Salary   :"+y_salary);
		sc.close();
	}

}
