package com.careerit.cj.oops.exceptions;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

class Employee {
	private String name;
	private int age;
	private String empCode;

	Employee() {
	}

	Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, age=%s, empCode=%s]", name, age, empCode);
	}
	
}

public class ExceptionExample {

	public static void main(String[] args) {

		Employee emp1 = new Employee("CV",25);
		Employee emp2 = new Employee("Manoj",39);
		Employee emp3 = new Employee();
		Employee emp4 = new Employee("Charan",39);
		
		Employee[] arr = new Employee[] {emp1,emp2,emp3,emp4};
		
		for(Employee emp:arr) {
		
			String name = emp.getName();
			try {
				System.out.println(name.toUpperCase());
				// Print name in upper case
				// Generate emp code for employee 2021-KRI-(1001-9999) 
				String sub = name.substring(0,3).toUpperCase();
				String code = LocalDate.now().getYear()+"-"+sub+"-"+ThreadLocalRandom.current().nextInt(1001, 10000);
				// Print employee code
				emp.setEmpCode(code);
				System.out.println(emp);
			}catch (NullPointerException e) {
				System.out.println("Exception :"+e);
			}catch (StringIndexOutOfBoundsException e) {
				System.out.println("Name has only :"+name.length()+" the id couldn't generated and name :"+name+" : "+e);
			}
		}
		// Logic
		System.out.println("End of the main method");
	}
}
