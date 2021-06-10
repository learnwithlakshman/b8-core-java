package com.careerit.cj.oops.interfaceexample;

interface I1{
	public abstract void m1();
}
interface I2{
	public abstract  void m1();
	public abstract  void m2();
}

interface I3 extends I1,I2{
	void m3();
}
class C1 implements I1,I2,I3{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}



interface SI1{
	public static final int a =100;
	void primeCount(int lb,int ub);
}
interface SI2{
	public static final int a =100;
	void primeCount(int lb,int ub);
}

class SOne implements SI1,SI2{
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void primeCount(int lb, int ub) {
		
		System.out.println(SI1.a);
		
	}
}

public class MathManager {

		public static void main(String[] args) {
			SI1 obj;
		}
}
