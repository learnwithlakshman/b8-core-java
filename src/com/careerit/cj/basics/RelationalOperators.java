package com.careerit.cj.basics;

public class RelationalOperators {
	public static void main(String[] args) {
		
			int[] ages = {23,45,34,25,22,21,26,29,28,21,23,24,25,23,47,20,21,45,23,50};
			
			// 25 to 30 sample data 20
			
			int count = 0;

			for(int age:ages) {
				if(age >=25 && age <= 30 ) {
					count++;
				}
			}
			System.out.println("Out of "+ages.length+" people "+count+" is in the given range");
			
	}

}
