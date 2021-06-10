package com.careerit.cj.collection.mapexample;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfWord {

	public static void main(String[] args) {
		String data = "Nina and Nina her family are happy to move from Kolkata to Delhi, but Nina is not happy about it. Will Nina parents be able to cheer her up on the train journey";
		data = data.replace(",", "").replace(".", "").toLowerCase();
		System.out.println(data);
		
		String[] arr = data.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word:arr) {
			map.putIfAbsent(word, 0);
			int count = map.get(word)+1;
			map.put(word, count);
		}
		System.out.println(map);
		
		
	}
}
