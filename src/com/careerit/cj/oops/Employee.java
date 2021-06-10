package com.careerit.cj.oops;

public class Employee {

	private int empno;
	private String ename;
	private String mobile;
	private double salary;
	private String city;
	private String zipcode;

	public Employee(int empno, String ename) {
		this(empno, ename, "N/A", 0.0, "N/A");
	}

	public Employee(int empno, String ename, String city) {
		this(empno, ename, "N/A", 0.0, city);
	}

	public Employee(int empno, String ename, double salary, String city) {
		this(empno, ename, "N/A", salary, city);
	}

	public Employee(int empno, String ename, String mobile, double salary, String city) {
		this(empno, ename, mobile, salary, city, "N/A");
	}

	public Employee(int empno, String ename, String mobile, double salary, String city, String zipcode) {
		this.empno = empno;
		this.ename = ename;
		this.mobile = mobile;
		this.salary = salary;
		this.city = city;
		this.zipcode = zipcode;
	}

	public void showDetails() {
		System.out.println(empno + " " + ename + " " + mobile + " " + salary + " " + city);
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
