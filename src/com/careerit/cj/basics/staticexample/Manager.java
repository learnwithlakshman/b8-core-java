package com.careerit.cj.basics.staticexample;

class Employee {
	int empno;
	String name;
	static String orgName="LWL";
	static int count= 0;

	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
		count++;
	}

	void showDetails() {
		System.out.println("Empno :" + empno + "\nName :" + name);

	}
}

public class Manager {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1001, "Krish");
		Employee emp2 = new Employee(1002, "Manoj");
		Employee emp3 = new Employee(1003, "Manoj");
		
		// Can you tell how many employee object are create so far
		
		System.out.println(emp1.count);
		System.out.println(Employee.count);
	}
}
