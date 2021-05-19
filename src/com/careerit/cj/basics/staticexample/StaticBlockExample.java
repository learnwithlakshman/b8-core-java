package com.careerit.cj.basics.staticexample;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

final class MathOperations {

	private MathOperations() {

	}

	public static int biggest(int a, int b) {
		return a > b ? a : b;
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	static class Inner{
		
	}

}

public class StaticBlockExample {

	static {
		out.println("Static Block1");
	}
	
	static int num = 100;
	public static void main(String[] args) {
		// MathOperations obj = new MathOperations();
//		out.println(args.length);
//		out.println(args[0]);
//		out.println(Integer.parseInt(args[1]) + 3);
//		out.println(Double.parseDouble(args[2]));
//		out.println(Boolean.parseBoolean(args[3]));
//
//		out.println(MathOperations.biggest(20, 30));
//		out.println(MathOperations.isEven(33));
//
//		out.println(sqrt(9));
//		out.println(pow(2, 3));
//		out.println(PI);
//		out.println(sin(90));
		
		num  = num + 5;
		System.out.println(num);
	}

}
