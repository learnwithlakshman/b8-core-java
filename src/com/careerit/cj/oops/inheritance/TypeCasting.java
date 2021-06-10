package com.careerit.cj.oops.inheritance;

class C1 {
	void m1() {
		System.out.println("M1");
	}
}

class C2 extends C1 {
	void m2() {
		System.out.println("M2");
	}
}

class C3 extends C2 {
	void m3() {
		System.out.println("M3");
	}
}

class C4 extends C3 {

}

class C5 {

}

public class TypeCasting {

	public static void main(String[] args) {

		C1 obj = getInstance();

		// If obj is pointing to C2 access m1 and m2 otherwise if it is pointing C3 you
		// should access all three method

		if (obj instanceof C3) {
			C3 c3 = (C3) obj;
			c3.m1();
			c3.m2();
			c3.m3();
		} else if (obj instanceof C2) {
			C2 c2 = (C2) obj;
			c2.m1();
			c2.m2();
		}

	}

	private static C1 getInstance() {

		return new C2();
	}
}
