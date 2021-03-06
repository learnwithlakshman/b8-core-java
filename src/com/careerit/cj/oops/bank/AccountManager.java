package com.careerit.cj.oops.bank;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] arr = new Account[1000];
		int count = 0;
		while (true) {
			System.out.println("1.Create 2.Withdraw 3.Deposit 4.Display 5. Display all account 6.Exit");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter the name :");
				String name = sc.nextLine();
				System.out.println("Enter the balance :");
				double balance = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the city :");
				String city = sc.nextLine();
				Account account = new Account(name, city, balance);
				arr[count++] = account;
				System.out.println("Account is create with account number :" + account.getAccNumber());
				break;
			case 2:
				System.out.println("Enter the account number to withdraw:");
				String accNumber = sc.nextLine();
				Account acc = getAccountDetails(arr, count, accNumber);
				if (acc != null) {
					System.out.println("Enter the amount :");
					double amount = sc.nextDouble();
					acc.withDraw(amount);
				} else {
					System.out.println("Sorry! please enter valid account number");
				}
				break;
			case 3:
				System.out.println("Enter the account number to deposit:");
				String daccNumber = sc.nextLine();
				Account dacc = getAccountDetails(arr, count, daccNumber);
				if (dacc != null) {
					System.out.println("Enter the amount :");
					double amount = sc.nextDouble();
					dacc.deposit(amount);
				} else {
					System.out.println("Sorry! please enter valid account number");
				}
				break;
			case 4:
				System.out.println("Enter the account number:");
				String accoutNumber = sc.nextLine();
				Account disacc = getAccountDetails(arr, count, accoutNumber);
				if (disacc != null) {
					disacc.showDetails();
				} else {
					System.out.println("Account is not found please entered valid account number:");
				}
				break;

			case 5:
				showAllAccount(arr, count);
				break;
			case 6:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please select 1-5 only");
			}
		}
	}

	private static void showAllAccount(Account[] arr, int count) {
		if (count == 0) {
			System.out.println("No account are created yet...");
			return;
		}
		for (int i = 0; i < count; i++) {
			Account acc = arr[i];
			acc.showDetails();
		}

	}

	private static Account getAccountDetails(Account[] arr, int c, String accoutNumber) {
		for (int i = 0; i < c; i++) {
			Account acc = arr[i];
			if (acc.getAccNumber().equals(accoutNumber)) {
				return acc;
			}
		}
		return null;
	}
}
