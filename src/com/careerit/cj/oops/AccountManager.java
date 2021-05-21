package com.careerit.cj.oops;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] arr = new Account[100];
		int count = 0;
		while (true) {
			System.out.println("1.Create 2.Withdraw 3.Deposit 4.Display 5. Exit");
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
				break;
			case 3:
				break;
			case 4:
				System.out.println("Enter the account number:");
				String accoutNumber = sc.nextLine();
				Account acc = getAccountDetails(arr, count, accoutNumber);
				if (acc != null) {
					acc.showDetails();
				} else {
					System.out.println("Account is not found please entered valid account number:");
				}
				break;
			case 5:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please select 1-5 only");
			}
		}
	}

	private static Account getAccountDetails(Account[] arr, int c, String accoutNumber) {
		System.out.println("Acc "+accoutNumber);
		for (int i = 0; i < c; i++) {
			Account acc = arr[i];
			if (acc.getAccNumber().equals(accoutNumber)) {
				return acc;
			}
		}
		return null;
	}
}
