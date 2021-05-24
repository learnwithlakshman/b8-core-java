package com.careerit.cj.oops.overloading;

import java.io.IOException;

class CommonUtil {

	public int add(int a, int b) {
		System.out.println("With int as parameters");
		return a + b;
	}
	
	public int add(char a, char b) {
		System.out.println("With char as parameters");
		return a + b;
	}


	public String add(String a, String b) {
		System.out.println("With str as parameters");
		return a + b;
	}

	public double add(double a, double b) {
		System.out.println("With double as parameters");
		return a + b;
	}
	
	
}

public class Manager {

		public static void main(String[] args) {
			CommonUtil obj = new CommonUtil();
			String res = obj.add("a","b");
			System.out.println("Result :"+res);
			
		}
}
