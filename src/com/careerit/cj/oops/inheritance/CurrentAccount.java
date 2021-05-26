package com.careerit.cj.oops.inheritance;

import static com.careerit.cj.oops.bank.AccountUtil.maskAccNumber;

public class CurrentAccount extends Account {

	private final double over_draft = 10000;
	private final String ACC_TYPE = "CB";
	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Account type   :" + ACC_TYPE);
	}
	@Override
	public void withDraw(double amount) {
		if (amount > (balance + over_draft)) {
			System.out.println("Sorry! you don't have sufficient fund to withdraw, you have balance only :" + balance);
		} else {
			balance -= amount;
			System.out.println("Your account :" + maskAccNumber(accNumber) + " has been withdrawn amount :" + amount
					+ " and balance :" + balance);
		}
	}
}
