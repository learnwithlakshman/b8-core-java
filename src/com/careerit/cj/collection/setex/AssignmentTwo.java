package com.careerit.cj.collection.setex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentTwo {

		public static void main(String[] args) {
			
			// Read data from names.txt and display unique names
			
			try {
				Set<String> set = new HashSet<>();
				List<String> list = Files.readAllLines(Paths.get("names.txt"));
				for(String name:list) {
					set.add(name.trim());
				}
				System.out.println(set);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
