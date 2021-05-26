package com.careerit.cj.oops.inheritance;

public final class IdGenUtil {

	private static final String PREFIX = "SB";
	private static long num = 1_000_000_001;

	private IdGenUtil() {

	}

	public static String newAccNumber() {
		return PREFIX + "-" + num++;
	}
}
