package com.careerit.cj.oops.overloading;

public class TypeCasting {

	public static void main(String[] args) {
		// Parsing
		// Casting
		// Boxing - Un-boxing

		String data = "1001-Krish-5.6-Male-65000";
		String[] arr = data.split("-");

		int empno = Integer.parseInt(arr[0]);
		String name = arr[1];
		float height = Float.parseFloat(arr[2]);
		String gender = arr[3];
		double salary = Double.parseDouble(arr[4]);

		salary += salary * 0.1;
		// Convert height ft to CM
		height = height * 30.48f;
		System.out.println(String.format("%s %s %s %s %s", empno, name, height, gender, salary));

		float a = 10.56f;
		int b = (int) a;

		long num = 9876567890l;
		float num1 = (float) num;
		System.out.println(a);
		System.out.println(b);

		// 1.5

		Integer obj = new Integer(100);

		int input = obj;

		int val = 10;
		Integer input2 = val;

		float result = (int)(3 /(float) 2);
		System.out.println(result);

	}
}

// byte -> short -> int -> char -> float -> double -> long