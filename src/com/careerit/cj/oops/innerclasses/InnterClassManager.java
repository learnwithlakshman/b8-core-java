package com.careerit.cj.oops.innerclasses;

import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

interface MyList {
	MyIterator iterator();
}

interface MyIterator extends Cloneable,Serializable {
	boolean hasNext();

	int next();
}

class EmployeeData implements MyList {

	private int[] empnoArr = { 1001, 1003, 1005, 1004, 1008, 1009, 1010, 1011 };

	@Override
	public MyIterator iterator() {
		return new MyIterator() {
			int count = 0;

			@Override
			public boolean hasNext() {
				if (count < empnoArr.length) {
					return true;
				}
				return false;
			}

			@Override
			public int next() {
				if (count <= empnoArr.length) {
					return empnoArr[count++];
				}
				throw new ArrayIndexOutOfBoundsException(count);
			}

		};
	}
//	class X implements MyIterator{
//		
//		int count = 0;
//		@Override
//		public boolean hasNext() {
//			if(count < empnoArr.length) {
//				return true;
//			}
//			return false;
//		}
//
//		@Override
//		public int next() {
//			if(count <= empnoArr.length ) {
//				return empnoArr[count++];
//			}
//			throw new ArrayIndexOutOfBoundsException(count);
//		}
//		
//	}
}

@FunctionalInterface
interface Operation {
	double perform(double a, double b);
}

class MathOperations {

	int a = 10;
	int b = 20;

	public double result(Operation obj) {
		return obj.perform(a, b);
	}

}
// Lambda are introduced to add functional style programming in Java

class RandonNubmers {

	int[] arr;

	public RandonNubmers() {
		int n = 5;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
	}

	public void filter(Predicate<Integer> p) {
		System.out.println("\n" + Arrays.toString(arr) + "\n");
		for (int i = 0; i < arr.length; i++) {
			if (p.test(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public int result(IntBinaryOperator ope) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = ope.applyAsInt(res, arr[i]);
		}
		return res;
	}

}

public class InnterClassManager {

	static class Inner {
		public static void show() {
			System.out.println("Show method");
		}
	}
	
	void show() {
		class Inner{
			
		}
			
	}

	public static void main(String[] args) {

		RandonNubmers obj = new RandonNubmers();
		obj.filter(num -> num % 2 == 0);
		obj.filter(num -> num % 2 != 0);
		obj.filter(num -> num >= 20 && num <= 50);

		int res = obj.result((a, b) -> a - b);
		System.out.println("The sum is :" + res);
		InnterClassManager.Inner.show();
	}
}
