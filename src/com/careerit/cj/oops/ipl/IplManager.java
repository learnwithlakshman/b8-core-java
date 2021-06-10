package com.careerit.cj.oops.ipl;

public class IplManager {

	public static void main(String[] args) {

		IplService service = new IplService();

//				String name = "RCB";
//				
//				Player[] players = service.getPlayerByTeam(name);
//				
//				for(Player player:players) {
//					System.out.println(player.getName()+" "+player.getTeam()+" "+player.getPrice());
//				}

		TeamAmount[] teams = service.getEachTeamAmount();
		for (TeamAmount team : teams) {
			System.out.println(team.getTeam() + " " + team.getAmount());
		}
		Player[] players = service.topPaidPlayers(5);
		for (Player player : players) {
			System.out.println(player.getName() + " " + player.getTeam() + " " + player.getPrice());
		}
		
		Player[] arr = service.topPidPlayersOfTeam("RCB");
		for(Player p:arr) {
			System.out.println(p.getName());
		}
	}
}
