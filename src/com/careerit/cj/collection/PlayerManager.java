package com.careerit.cj.collection;

import java.util.List;

class Player{
	
}

public class PlayerManager {

		public static void main(String[] args) {
				List<Player> list = getPlayers();
				showPlayers(list, "CSK");
				showSummary(list,"CSK");
		}
		
	

		private static List<Player> getPlayers(){
			// Load data from csv, add to the list and return the players list
			
			return null;
		}
		
		private static void showPlayers(List<Player> list,String teamName) {
			// name - Role - Price
		}
		private static void showSummary(List<Player> list, String string) {
			// Count players
			// Total amount
			// Maximum amount
			// Minimum amount
			
			// Logic
			
			// Count :{} total amount {} min amount :{} max amount: {}
			
		}
}
