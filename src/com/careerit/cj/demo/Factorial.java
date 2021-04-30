package com.careerit.cj.demo;

public class Factorial {

		public static void main(String[] args) {
			int num = 6;
			int res = 1;
			for(int i=2;i<=num;i++){
				res = res * i;
			}
			System.out.println("Factorial of :"+num+" is :"+res);
		
			String name = "Krish";
			System.out.println(name.toLowerCase());
		}
}
