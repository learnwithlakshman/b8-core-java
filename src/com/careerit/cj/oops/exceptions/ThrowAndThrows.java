package com.careerit.cj.oops.exceptions;

import java.io.IOException;
import java.util.List;

public class ThrowAndThrows {

	public static void main(String[] args) {

		try {
			readDataFromFile("xyz.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			divide(10,0);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End of main");
		

	}
	
	@Override
	protected void finalize() throws Throwable {
			System.gc();
	}

	public static List<String> readDataFromFile(String fileName) throws IOException {

		return null;
	}

	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Value of b can't be zero");
		}
		return a / b;
	}
}
