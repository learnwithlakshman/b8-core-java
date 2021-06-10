package com.careerit.cj.basics.stringbasics;

public class StringBufferExample {

		public static void main(String[] args) {
			String title = "Mr";
			String firstName = "Krish";
			String lastName = "T";
			int age = 34;
			String country = "IND";
			String adhar = "876545678933";
			String accountnum = "98765456789";
						
			// "Mr Krish T 34 IND"
			String maskAdhar = "XXXXXXXXXXX"+adhar.substring(adhar.length()-4);
			StringBuilder sb = new StringBuilder();
			sb.append(title).append(" ").append(firstName).append(" ").append(lastName)
			.append(" ").append(age).append(" ").append(country).append(" ").append(maskAdhar);
			String data = sb.toString();
			System.out.println(data);
			
			String name = "LIRIL";
			StringBuffer sb1 = new StringBuffer(name);
			if(sb1.reverse().toString().equals(name)) {
				
			}
			
			// Mask account number 
			
			
			
		}
}
