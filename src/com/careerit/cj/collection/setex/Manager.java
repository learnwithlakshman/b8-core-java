package com.careerit.cj.collection.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Manager {

		public static void main(String[] args) {
			
				Set<Integer> set = new HashSet<>();
				
				set.add(9001);
				set.add(1002);
				set.add(2001);
				set.add(1004);
				set.add(3005);
				set.add(2001);
				set.add(1004);
				set.add(null);
				
				System.out.println(set.isEmpty());
				set.remove(null);
				System.out.println(set);
				
				Iterator<Integer> itr = set.iterator();
				while(itr.hasNext()) {
					Integer ele = itr.next();
					System.out.println(ele);
					if(ele>=3000)
						itr.remove();
				}
				System.out.println(set);
		}
}
