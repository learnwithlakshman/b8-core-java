package com.careerit.cj.oops.ipl;

public class IplService {

	private static Player[] arr;

	static {
		arr = CsvReaderUtil.loadPlayers();
	}

	public IplService() {

	}

	public RoleCount[] getRoleCount(String team) {
		// Logic

		return null;
	}

	public Player[] getPlayerByTeam(String team) {
		Player[] playerArr;
		int count = playersCount(team);
		if (count != 0) {
			playerArr = new Player[count];
			int i = 0;
			for (Player p : arr) {
				if (p.getTeam().equalsIgnoreCase(team)) {
					playerArr[i++] = p;
				}
			}
		} else {
			playerArr = new Player[] {};
		}
		return playerArr;
	}

	public Player[] getPlayerByCountry(String country) {
		Player[] playerArr;
		int count = playersCount(country);
		if (count != 0) {
			playerArr = new Player[count];
			int i = 0;
			for (Player p : arr) {
				if (p.getCountry().equalsIgnoreCase(country)) {
					playerArr[i++] = p;
				}
			}
		} else {
			playerArr = new Player[] {};
		}
		return playerArr;
	}

	public Player[] topPaidPlayers(int num) {
		sort(arr);
		Player[] temp = new Player[num];
		System.arraycopy(arr, 0, temp, 0, num);
		return temp;
	}

	public Player[] topPidPlayersOfTeam(String team) {
		Player[] players = getPlayerByTeam(team);
		sort(players);
		double max = getMaxPrice(players);

		Player[] maxPaidArr = new Player[players.length];
		int count = 0;
		int i = 0;
		for (Player p : players) {
			if (p.getPrice() == max) {
				count++;
				maxPaidArr[i++] = p;
			}
		}

		Player[] temp = new Player[count];
		System.arraycopy(maxPaidArr, 0, temp, 0, i);
		return temp;

	}

	private double getMaxPrice(Player[] players) {
		double max = players[0].getPrice();
		for (Player p : players) {
			if (p.getPrice() > max) {
				max = p.getPrice();
			}
		}
		return max;
	}

	public TeamAmount[] getEachTeamAmount() {
		TeamAmount[] teams = uniqueTeams();

		for (TeamAmount team : teams) {

			double amount = 0;
			for (Player player : arr) {
				if (player.getTeam().equals(team.getTeam())) {
					amount += player.getPrice();
				}

			}
			team.setAmount(amount);
		}
		return teams;
	}

	private void sort(Player[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].getPrice() < arr[j + 1].getPrice()) {
					Player t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}

	private TeamAmount[] uniqueTeams() {
		String[] teamNames = new String[10];
		int count = 0;
		for (Player player : arr) {
			if (!isPresent(teamNames, player.getTeam(), count)) {
				teamNames[count++] = player.getTeam();
			}
		}
		TeamAmount[] teamAmount = new TeamAmount[count];
		int i = 0;
		for (int j = 0; j < count; j++) {
			String name = teamNames[j];
			TeamAmount obj = new TeamAmount();
			obj.setTeam(name);
			teamAmount[i++] = obj;
		}
		return teamAmount;
	}

	private boolean isPresent(String[] teamNames, String team, int count) {
		if (count != 0) {
			for (int i = 0; i < count; i++) {
				if (teamNames[i].equals(team)) {
					return true;
				}
			}
		}
		return false;
	}

	private int playersCount(String team) {

		int count = 0;
		for (Player player : arr) {
			if (player.getTeam().equalsIgnoreCase(team)) {
				count++;
			}
		}
		return count;
	}

	private int playersCountByCountry(String countryName) {

		int count = 0;
		for (Player player : arr) {
			if (player.getCountry().equalsIgnoreCase(countryName)) {
				count++;
			}
		}
		return count;
	}

}
