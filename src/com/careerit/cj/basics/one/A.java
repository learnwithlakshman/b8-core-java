package com.careerit.cj.basics.one;

public class A {

	private int pri_a = 100;
	public int pub_a = 200;
	protected int pro_a = 300;
	int def_a = 400;

	public void show() {
		System.out.println(pub_a);
		System.out.println(pro_a);
		System.out.println(def_a);
		System.out.println(pri_a);
	}
}
