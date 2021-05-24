package com.careerit.cj.oops.bank;

public final class AccountUtil {

	private AccountUtil() {

	}

	public static String maskAccNumber(String accNumber) {
		if (accNumber.length() >= 4) {
			return "XXXXXXXXX" + accNumber.substring(accNumber.length() - 4);
		}
		return accNumber;
	}

	public String maskMobile(String mobile) {

		return null;
	}
}
