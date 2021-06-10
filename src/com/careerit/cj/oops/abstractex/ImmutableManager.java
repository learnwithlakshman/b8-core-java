package com.careerit.cj.oops.abstractex;

class Employee {

	private final String name;
	private final double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee incrementSalary(double amount) {
		return new Employee(name, salary + amount);
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, salary=%s]", name, salary);
	}

}

public class ImmutableManager {

	public static void main(String[] args) {
		Employee emp = new Employee("Naresh", 45000);
		System.out.println(emp);
		Employee emp1 = emp.incrementSalary(5000);
		System.out.println(emp);
		System.out.println(emp1);
	}
}
