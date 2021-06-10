package com.careerit.cj.oops;

class Student {
	private int regno;
	private String name;
	private int age;

	public Student(int regno, String name, int age) {
		this.regno = regno;
		this.name = name;
		this.age = age;
	}

	public void incrementAge() {
		age++;
	}

	public void showDeatils() {
		System.out.println("Regno :" + regno);
		System.out.println("Name  :" + name);
		System.out.println("Age   :" + age);
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}

public class Manager {

	public static void main(String[] args) {
			
			
			Student s1 = new Student(1001,"Krish",17);  
			Student s2 = new Student(2001,"Sai",19);
			Student s3 = new Student(3001,"Balu",17);
			Student s4 = new Student(4001,"RamCharan",15);
			Student s5 = new Student(5001,"Charan",17);
			Student s6 = new Student(6001,"Manoj",19);
			
			// Display all the students
			
			Student[] students = new Student[] {s1,s2,s3,s4,s5,s6};
			
			for(Student s:students) {
				s.showDeatils();
				System.out.println("----------------------------------------");
			
			}
			
			// Can increment Balu age by 1 year
			
			for(Student s:students) {
				if(s.getName().equalsIgnoreCase("Balu")) {
					s.incrementAge();
				}
			}
			
		
			for(Student s:students) {
				s.showDeatils();
				System.out.println("----------------------------------------");
			
			}
			
			// Can get me the average age of the students
			double sum = 0;
			for(Student s:students) {
				sum += s.getAge();
			}
			
			double avg = sum / students.length;
			System.out.println("Average age is :"+avg);
			
			
			// update manoj age to 15
			for(Student s:students) {
				if(s.getName().equalsIgnoreCase("Manoj")) {
					s.setAge(15);
				}
			}
			
			
		}
}

// Instance variables 0, 0.0, null, false