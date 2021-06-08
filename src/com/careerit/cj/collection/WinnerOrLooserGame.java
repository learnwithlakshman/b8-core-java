package com.careerit.cj.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WinnerOrLooserGame {

	public static void main(String[] args) {
		
			List<Integer> hero = powersOfPlayer1();
			List<Integer> villain = powersOfPlayer2();
			
			// Find winner of the match (hero or villain)
			
			// If hero powers is greater than villain more than 3 places the winner is hero otherwise villain
			System.out.println(hero);
			System.out.println(villain);
			
			// Logic 
			
	}

	public static List<Integer> powersOfPlayer1() {
			List<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=5;i++) {
				list.add(ThreadLocalRandom.current().nextInt(10, 20));
			}
			return list;
	}

	public static List<Integer> powersOfPlayer2() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			list.add(ThreadLocalRandom.current().nextInt(10, 20));
		}
		return list;
	}
}
