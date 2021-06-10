package com.careerit.cj.basics.stringbasics;

public class Manager {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1001, "Krish", "krish@gmail.com",98654);
			Employee emp2 = new Employee(1002, "Manoj", "manoj@gmail.com",98655);
			emp1.salary = 100000;
			emp1.showDetails();
			emp2.showDetails();
		}
}
