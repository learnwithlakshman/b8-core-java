package com.careerit.cj.oops.innerclasses;

import java.util.function.Predicate;

public interface PlayerService {

	public void addPlayer(Player player);

	public void deletePlayer(String name);

	public void showPlayers();

	public void showPlayers(Predicate<Player> predicate);

	public void updatePlayerPrice(String name, double price);
	public void showPlayerDetails(String name);
}