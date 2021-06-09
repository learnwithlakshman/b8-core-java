package com.careerit.cj.collection.setex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

		public static void main(String[] args) {
			List<String> cricketPlayers = getCricketPlayers();
			List<String> footBallPlayers = getFootballPlayers();
			
			Set<String> players = new HashSet<String>();
			players.addAll(cricketPlayers);
			players.addAll(footBallPlayers);
			System.out.println(players);
				
			Set<Integer> set1 = new HashSet<Integer>();
			set1.add(1001);
			set1.add(1002);
			set1.add(1003);
			set1.add(1005);
			
			Set<Integer> set2 = new HashSet<Integer>();
			set2.add(1001);
			set2.add(1002);
			set2.add(1004);
			
			//set1.addAll(set2);
			//System.out.println(set1);
			
			set1.retainAll(set2);
			System.out.println(set1);
			
		}
		
		private static List<String> getCricketPlayers() {
			List<String> list = new ArrayList<>();
			list.add("Charan");
			list.add("Sai");
			list.add("Tanvi");
			list.add("Dhatri");
			list.add("Manoj");
			return list;
		}

		private static List<String> getFootballPlayers() {
			List<String> list = new ArrayList<>();
			list.add("Charan");
			list.add("Sai");
			list.add("Naresh");
			list.add("Nagamani");
			list.add("Ravi");
			list.add("Jayesh");
			list.add("Suresh");
			return list;
		}
}
