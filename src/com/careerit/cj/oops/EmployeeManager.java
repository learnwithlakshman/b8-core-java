package com.careerit.cj.oops;

public class EmployeeManager {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1001, "Krish");
		Employee emp2 = new Employee(1002, "Krish", "BZA");
		Employee emp3 = new Employee(1003, "Krish", 87695, "GNT");
		Employee emp4 = new Employee(1004, "Sai", "Bangalore");
		Employee emp5 = new Employee(1005, "Manoj", "987654321", 99999, "Bangalore");

		Employee[] empArr = new Employee[] { emp1, emp2, emp3, emp4, emp5 };
		for (Employee emp : empArr) {
			emp.showDetails();
		}

		// Send email people who has not provided city name

		for (Employee emp : empArr) {
			if (emp.getCity().equals("N/A")) {
				System.out.println("Dear " + emp.getEname() + " please update your city details");
			}
		}
		
		

	}
}
