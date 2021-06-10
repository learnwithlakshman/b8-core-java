package com.careerit.cj.basics.finalexamples;

class One{
	
	final void show() {
		System.out.println("Show method of One class");
	}
}

class Two extends One{
	
	void display() {
		System.out.println("Display method of Two class");
	}
}

public class FinalKeyWordExamples {

		public static void main(final String[] args) {
				
				final int NO_DAYS_IN_WEEK = 7;
				
				// Reference 
				
				//args = new String[] {};
				args[0] = "Hello";
		}
}
