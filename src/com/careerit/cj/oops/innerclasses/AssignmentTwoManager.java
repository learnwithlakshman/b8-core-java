package com.careerit.cj.oops.innerclasses;

public class AssignmentTwoManager {

	public static void main(String[] args) {

		PlayerService service = new PlayerServiceImpl();

		Player player1 = new Player("VVS LAXMAN", 50000);
		Player player2 = new Player("Dhoni", 60000);
		Player player3 = new Player("Sachin", 70000);
		Player player4 = new Player("Sami", 25000);
		Player player5 = new Player("Binny", 45000);
		Player player6 = new Player("Rahul", 28000);
		Player player7 = new Player("Bhuvi", 48000);

		service.addPlayer(player1);
		service.addPlayer(player2);
		service.addPlayer(player3);
		service.addPlayer(player4);
		service.addPlayer(player5);
		service.addPlayer(player6);
		service.addPlayer(player7);

		service.showPlayers();

		// Show the player who are getting more 50000
		System.out.println("--------Players getting more than 50K--------------");
		service.showPlayers(p -> p.getPrice() > 50000);

		System.out.println("--------Players name ends with letter 'i' --------------");
		service.showPlayers(p -> p.getName().endsWith("i"));

		System.out.println("--------Players getting between 30K 50K --------------");
		service.showPlayers(p -> p.getPrice() >= 30000 && p.getPrice() <= 50000);

		System.out.println("------- update player ---------------------");

		service.showPlayerDetails("Bhuvi");
		service.updatePlayerPrice("Bhuvi", 50000);
		service.showPlayerDetails("Bhuvi");
	}
}
