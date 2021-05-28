package com.careerit.cj.oops.abstractex;

abstract class One{
	public One() {
		super();
		System.out.println("One");
	}
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class Two extends One{
	public Two() {
		super();
		System.out.println("Two");
	}
	@Override
	void m1() {
		
	}
	@Override
	void m3() {
		
	}
	
}
class Three extends Two{
	public Three() {
		super();
		System.out.println("Three");
	}
	@Override
	void m2() {		
	}
	
}

public class Manager {
	public static void main(String[] args) {
		One obj = new Three();
	}
}
