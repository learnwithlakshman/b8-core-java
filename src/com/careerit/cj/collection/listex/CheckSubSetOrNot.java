package com.careerit.cj.collection.listex;

import java.util.ArrayList;
import java.util.List;

public class CheckSubSetOrNot {

	public static void main(String[] args) {

		List<String> flist = getFootballPlayers();
		List<String> clist = getCricketPlayers();
		
		// Get players who are playing both games
		
		
		// Get player who are playing only one game
		
		
		// Display players name in uppercase
		
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
