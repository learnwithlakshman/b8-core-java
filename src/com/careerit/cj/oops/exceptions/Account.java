package com.careerit.cj.oops.exceptions;

public class Account {

		private int accNumber;
		private String name;
		private double balance;
		
		Account(int accNumber, String name, double balance) {
			super();
			this.accNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}

		public void withDraw(double amount)throws InsufficientFundsExcpetion {
				if(amount > balance) {
					throw new InsufficientFundsExcpetion("You have :"+balance+" and trying withdraw :"+amount);
				}
				this.balance -= amount;
				System.out.println("The current balance :"+balance);
		}
}
