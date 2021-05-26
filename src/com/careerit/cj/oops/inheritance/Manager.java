package com.careerit.cj.oops.inheritance;

class One {
	int a = 100;
	One() {
		System.out.println("One");
	}
	void m1() {
		System.out.println("M1");
	}
}

class Two extends One {
	int a = 999;
	 Two(String message) {
		System.out.println("Two");
	}
	 @Override
	 void m1() {
		 System.out.println("Hello M1");
	 }
	 void m2() {
		 System.out.println("Hello M2");
	 }
}

class Three extends Two {
	Three() {
		super("Dummy");
		System.out.println("Three");
	}
	void m3() {
		System.out.println("Hello M3");
	}
		
	
}

public class Manager {

	public static void main(String[] args) {

		One obj = new Two("");
		obj.m1();
		System.out.println(obj.a);
	
	}
}
