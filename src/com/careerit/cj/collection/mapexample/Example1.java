package com.careerit.cj.collection.mapexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		empList.sort(Comparator.comparing(Employee::getFullName).thenComparing(Comparator.comparing(Employee::getSalary).reversed()));
		
		empList.stream().forEach(System.out::println);
		empList.stream().forEach(e -> {
			System.out.println(e.getFullName() + " " + e.getSalary());
		});
	}

	private static List<Employee> getEmpList() {
		return Arrays.asList(new Employee("Lakshman A", "Consultent", 450000),
				new Employee("Chaitra S", "Developer", 250000), new Employee("Manoj PVN", "Developer", 450000),
				new Employee("Manoj PVN", "Developer", 280000), new Employee("Suresh S", "Developer", 270000),
				new Employee("Jaishree", "Opearations HR", 350000));
	}

	
}

class Employee {
	private String fullName;
	private String designation;
	private Double salary;

	public Employee(String fullName, String designation, double salary) {
		super();
		this.fullName = fullName;
		this.designation = designation;
		this.salary = salary;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", designation=" + designation + ", salary=" + salary + "]";
	}

}