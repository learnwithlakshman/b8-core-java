package com.careerit.cj.oops.inheritance;

import java.io.IOException;

class COne {

	void m1() {
		System.out.println("One");
	}
}

class CTwo extends COne {
	int a = 100;

	protected void m1() {
		System.out.println("Two" + a);
	}

	public Number m2() throws IOException {
		return null;
	}
}

class CThree extends CTwo {
	int a = 999;

	@Override
	protected void m1() {
		System.out.println("Three" + super.a);
	}
	@Override
	public Float m2() {
		return 1.0f;
	}

	public void m1(String str) {

	}
}

public class SuperManagerExample {

	public static void main(String[] args) {
		COne obj = new CThree();
		obj.m1();
	}
}
