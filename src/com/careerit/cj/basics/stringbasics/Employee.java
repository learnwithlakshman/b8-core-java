package com.careerit.cj.basics.stringbasics;

public class Employee {

	int empno;
	String name;
	String email;
	double salary;

	public Employee(int empno, String name, String email, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	void showDetails() {
		System.out.println("Empno   :"+empno);
		System.out.println("Name    :"+name);
		System.out.println("Email   :"+email);
		System.out.println("Salary  :"+salary);
	}

}
