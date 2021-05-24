package com.careerit.cj.oops.bank;

public final class AccountNumberGenerator {
		
		private static final String PRE_FIX="SB-3036";
		private static long number = 100001;
		private AccountNumberGenerator() {
		}
		public static String getNewAccountNumber() {
			return PRE_FIX+number++;
		}
}
