package com.careerit.cj.oops.exceptions;

class E1Exception extends Exception{
	
}
class E2Exception extends E1Exception{
	
}
class E3Exception extends Exception{
	
}

class One{
	void show() throws E1Exception{
		
	}
}
class Two extends One{
	void show(){
		
	}
}


public class OverrideExceptionExample {

		public static void main(String[] args) {
			
		}
}
