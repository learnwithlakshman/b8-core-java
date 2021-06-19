package com.careerit.cj.collection.mapexample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithArrayList {

		public static void main(String[] args) {
			String data = "Rajesh,Krish,Manoj,Charan,Jayesh,Suresh,Mahesh,Naresh,Jaya,Mahesh,Naresh,Jaya,Mahesh,Naresh,Jaya,Krish,Manoj,Charan,Jayesh,Suresh,Mahesh";
			
			List<String> list = Arrays.asList(data.split(","));
			
//			Map<String,Integer> map = new HashMap<>();
//			for(String ele:list) {
//				map.putIfAbsent(ele, 0);
//				map.put(ele,map.get(ele)+1);
//			}
//			System.out.println(map);
			
			Map<String, Long> map = list.stream()
					.filter(e->e.endsWith("h"))
					.map(e->e.toUpperCase())
					.collect(Collectors.groupingBy(e->e,Collectors.counting()));
			System.out.println(map);
		}
}
