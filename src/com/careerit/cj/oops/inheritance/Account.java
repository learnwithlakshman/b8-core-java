package com.careerit.cj.oops.inheritance;

import static com.careerit.cj.oops.bank.AccountUtil.maskAccNumber;

public class Account {

	String accNumber;
	String name;
	double balance;

	public Account(String name, double balance) {
		if (accNumber == null) {
			this.accNumber = IdGenUtil.newAccNumber();
		}
		this.name = name;
		this.balance = balance;
	}

	public void showDetails() {
		System.out.println("Account number :" + maskAccNumber(accNumber));
		System.out.println("Name           :" +name);
		System.out.println("Balance        :" + balance);
	}

	public void withDraw(double amount) {
		if (amount > balance) {
			System.out.println("Sorry! you don't have sufficient fund to withdraw, you have balance only :" + balance);
		} else {
			balance -= amount;
			System.out.println("Your account :" + maskAccNumber(accNumber) + " has been withdrawn amount :" + amount
					+ " and balance :" + balance);
		}
	}

	public void deposit(double amount) {
		System.out.println("Your account :" + maskAccNumber(accNumber) + " has been deposited amount :" + amount
				+ " and balance :" + balance);
		this.balance += amount;
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

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
