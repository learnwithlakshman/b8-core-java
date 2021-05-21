package com.careerit.cj.oops;

public class Account {

	private String accNumber;
	private String name;
	private String city;
	private double balance;

	public Account(String name, String city, double balance) {
		if (this.accNumber == null) {
			this.accNumber = AccountNumberGenerator.getNewAccountNumber();
		}
		this.name = name;
		this.city = city;
		this.balance = balance;
	}

	public void showDetails() {
		// Account number *********** 0001 name : {} balance : balance {}
	}

	public void withDraw(double amount) {
		// Check he/she has sufficient fund, if not display error message saying
		// insufficient funds, otherwise allow him to withdraw then then display balance
		// Amount {} is withdrawn from Account number *********** 0001 balance {}
	}

	public void deposit(double amount) {
		// Amount {} is deposited from Account number *********** 0001 balance {}
	}

	public String getAccNumber() {
		return accNumber;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
