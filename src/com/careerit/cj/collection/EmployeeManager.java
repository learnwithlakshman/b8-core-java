package com.careerit.cj.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee extends Object{
	
		private int empno;
		private String ename;
		private double salary;
		Employee(int empno, String ename, double salary) {
			this.empno = empno;
			this.ename = ename;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return String.format("Employee [empno=%s, ename=%s, salary=%s]", empno, ename, salary);
		}
		@Override
		public int hashCode() {
			return Objects.hash(empno, ename, salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return empno == other.empno && Objects.equals(ename, other.ename)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		public int getEmpno() {
			return empno;
		}
		public String getEname() {
			return ename;
		}
		public double getSalary() {
			return salary;
		}
		
		
	
	
}

public class EmployeeManager {

		public static void main(String[] args) {
			
				Employee emp1 = new Employee(1001, "Krish", 45000);
				Employee emp2 = new Employee(1002, "Charan", 95000);
				Employee emp3 = new Employee(1003, "Manoj", 85000);
			
				List<Employee> list =  new ArrayList<Employee>();
				list.add(emp1);
				list.add(emp2);
				list.add(emp3);
				Employee emp4 = new Employee(1004, "Suresh", 115000);
				list.add(emp4);
				
				for(Employee emp : list) {
					System.out.println(emp.getEname());
				}
		}
}
