package com.careerit.cj.basics;

import java.util.Scanner;

public class CurrencyConvator {

	public static void main(String[] args) {
		// fromCurrency , toCurrency , amount

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		long amount = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the from Currency ( USD | EURO ) only");
		String fromCurrency = sc.nextLine();
		System.out.println("Enter the to Currency (INR | LKR) only ");
		String toCurrency = sc.nextLine();

		float price;

		if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
			price = 73.93f;
		} else if (fromCurrency.equals("USD") && toCurrency.equals("LKR")) {
			price = 197.02f;
		} else if (fromCurrency.equals("EURO") && toCurrency.equals("INR")) {
			price = 89.04f;
		} else if (fromCurrency.equals("EURO") && toCurrency.equals("LKR")) {
			price = 237.30f;
		} else {
			System.out.println("We dont' support given currency");
			return;
		}

		double convertedAmount = price * amount;
		System.out.println(fromCurrency +" "+ amount + " = " + convertedAmount +" "+ toCurrency);
		sc.close();

	}
}
