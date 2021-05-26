package com.careerit.cj.oops.inheritance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AccountManager {

	public static void main(String[] args) throws IOException {

		Account[] accounts = getAllAccounts();

		// Can you display only savings account and total balance of all the saving
		// account
	
		for (Account acc : accounts) {
			acc.showDetails();
			System.out.println("----------------------------------------");
		}
		
		// Print count of current and savings accounts
		
		// Put interest amount (if balance <5000 500 otherwise 1000)  saving account 1000 current account (if balance <50000 5000 otherwise 10000)  
		
		// Print only customer names, balance
		
		

	}

	private static Account[] getAllAccounts() throws IOException {
		List<String> list = Files.readAllLines(Paths.get("accounts.csv"));
		Account[] accounts = new Account[list.size() - 1];
		int count = 0;
		for (int i = 1; i < list.size(); i++) {
			String data = list.get(i);
			Account acc = null;
			String[] arr = data.split(",");
			String name = arr[0];
			double balance = Double.parseDouble(arr[1]);
			String type = arr[2];
			if (type.equalsIgnoreCase("sb")) {
				acc = new SavingsAccount(name, balance);
			} else if (type.equalsIgnoreCase("cb")) {
				acc = new CurrentAccount(name, balance);
			} else {
				throw new IllegalArgumentException("We dont' support given account type");
			}
			accounts[count++] = acc;
		}
		return accounts;
	}
}
