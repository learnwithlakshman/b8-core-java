package com.careerit.cj.oops.innerclasses;

import java.util.function.Predicate;

class PlayerServiceImpl implements PlayerService {

	private Player[] playerArr;
	int count = 0;

	public PlayerServiceImpl() {
		playerArr = new Player[2];
	}

	@Override
	public void addPlayer(Player player) {
		if (count >= playerArr.length) {
			Player[] temp = new Player[playerArr.length + playerArr.length / 2];
			System.arraycopy(playerArr, 0, temp, 0, playerArr.length);
			playerArr = temp;
		}
		playerArr[count++] = player;

	}

	@Override
	public void deletePlayer(String name) {
		int i = indexOf(name);
		if (i != -1) {
			// Logic
			
			count--;
			
		} else {
			System.out.println("Player with name :" + name + " is not found");
		}

	}

	@Override
	public void showPlayers() {
		if (count == 0) {
			System.out.println("No players are added yet....");
		} else {
			for (int i = 0; i < count; i++) {
				Player p = playerArr[i];
				System.out.println(p.getName() + " " + p.getPrice());
			}
		}

	}

	@Override
	public void showPlayers(Predicate<Player> predicate) {

		for (int i = 0; i < count; i++) {
			Player p = playerArr[i];
			if (predicate.test(p)) {
				System.out.println(p.getName() + " " + p.getPrice());
			}
		}

	}

	@Override
	public void updatePlayerPrice(String name, double price) {
		int i = indexOf(name);
		if (i != -1) {
			playerArr[i].setPrice(price);
		} else {
			System.out.println("Player with name :" + name + " is not found");
		}

	}
	@Override
	public void showPlayerDetails(String name) {
		int i = indexOf(name);
		if (i != -1) {
			Player p = playerArr[i];
			System.out.println(p.getName() + " " + p.getPrice());
		} else {
			System.out.println("Player with name :" + name + " is not found");
		}
		
	}

	private int indexOf(String name) {
		for (int i = 0; i < count; i++) {
			Player p = playerArr[i];
			if (p.getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}

	

}
