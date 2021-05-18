package com.careerit.cj.basics.stringbasics;

public class StringMethods {

		public static void main(String[] args) {
				String name = "Krish";
				System.out.println(name.length());  
				
				// Convert name to upper case and print char by char
				
				name = name.toUpperCase();
				System.out.println(name);

				for(int i=0;i<name.length();i++) {
					System.out.println(name.charAt(i));
				}
				
				char[] arr = name.toCharArray();
				for(Character c:arr) {
					System.out.println(c);
				}
				
				String data = " Lakshman, Manoj Pvn ,  Charan  ,Kiran T, John, Suresh  ,Jayesh"; // CSV format
				// Print one by one name in upper case and remove only leading and trailing edge white spaces, print only first 3 characters 
				String[] nameArray = data.split(",");
				for(String n:nameArray) {
						n = n.trim().toUpperCase();						
						System.out.println(n.substring(0,3));
				}
				
				String str = "Hello Ram";
				System.out.println(str.substring(5).trim().toLowerCase().substring(0,1));
				
				String s1 = "Core";
				String s2 = s1.concat(" Java");
				System.out.println(s2);
				
				String[] username="lakshman,krish,maonj,charan,naresh,jayesh,mahesh,swathi,swathi,ram,kishore,swathi,tanvi,dhatri,laxmi".split(",");
				
				// Count the occurrence of given name ignore case
				// Count the names which ends with "SH" ignore case
				
				String key = "SWATHI";
				int count = 0;
				for(String n:username) {
					if(n.equalsIgnoreCase(key)) {
						count++;
					}
				}
				System.out.println(count);
				
				
		}
}
