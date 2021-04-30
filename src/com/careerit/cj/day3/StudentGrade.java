package com.careerit.cj.day3;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// 0-5 - C 6 - 8 - B 9-10 - A

		// Accept student details: name, score and print the grade

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the score: ");
		int score = sc.nextInt();

		String grade;

		if (score >= 0 && score <= 5) {
			grade = "C";
		} else if (score >= 6 && score <= 8) {
			grade = "B";
		} else if (score >= 9 && score <= 10) {
			grade = "A";
		} else {
			grade = "Invalid Score";
		}
		System.out.println("Dear "+name+", Score :"+score+" Grade :"+grade);
		sc.close();
	}
}
