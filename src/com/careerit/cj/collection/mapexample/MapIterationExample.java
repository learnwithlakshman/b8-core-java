package com.careerit.cj.collection.mapexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class MapIterationExample {

		public static void main(String[] args) {
			
				String data = "Rajesh,Krish,Manoj,Charan,Jayesh,Suresh,Mahesh,Naresh,Jaya";
				Map<String,Integer> map = new HashMap<>();
				
				for(String name:data.split(",")) {
					map.put(name,name.length());
				}
				
				Set<String> set = map.keySet();
				
				for(String key:set) {
					Integer value = map.get(key);
					System.out.println(key +" ===> "+value);
				}
				
				Collection<Integer> values = map.values();
				for(Integer value:values) {
					System.out.println(value);
				}
				
				Set<Entry<String, Integer>> entrySet = map.entrySet();
				for(Entry<String,Integer> entry:entrySet) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
				
				System.out.println("----------- Java8 ------------------");
				
				map.entrySet().stream().forEach(entry->{
					System.out.println(entry.getKey()+" "+entry.getValue());
				});
		}
}
