package com.careerit.cj.collection.mapexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

	


public class CollectionSortExample {

	
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(1001);
			list.add(1009);
			list.add(1010);
			list.add(1015);
			list.add(1020);
			System.out.println(list);
			list =list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
			System.out.println(list);
		}
}
