package com.careerit.cj.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
			
			List<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(12);
			list.add(15);
			list.add(13);
			list.add(11);
			
			System.out.println(list.size());
			System.out.println(list.get(2));
			System.out.println("------------------------------------");
			for(int i=0;i<list.size();i++) {
				int num = list.get(i);
				System.out.println(num);
			}
			System.out.println("------------------------------------");
			for(int i=list.size()-1;i>=0;i--) {
				int num = list.get(i);
				System.out.println(num);
			}
			System.out.println("------------ for each --------------");
			for(int ele:list) {
				System.out.println(ele);
			}
			
			list.add(16);
		 	System.out.println(list);
			list.add(0,9);
			System.out.println(list);
			
			list.remove(Integer.valueOf(16));
			System.out.println(list);
			
			list.remove(2);
			System.out.println(list);
			
			list.remove(Integer.valueOf(11));
			System.out.println(list);
			List<Integer> list1 = new ArrayList<>();
			list1.add(3);
			list1.add(5);
			list1.add(6);
			
			list.addAll(0,list1);
			System.out.println(list);
			List<Integer> list2 = new ArrayList<>();
			list2.add(15);
			list2.add(3);
			
			list.removeAll(list2);
			System.out.println(list);
			
			System.out.println(list.contains(10));
			System.out.println(list.contains(15));
	}

}
