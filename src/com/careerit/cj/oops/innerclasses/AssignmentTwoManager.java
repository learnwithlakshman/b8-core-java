package com.careerit.cj.oops.innerclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Player {
	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

interface PlayerService {

	public void addPlayer(Player player);

	public void deletePlayer(String name);

	public void showPlayers();

	public void displayPlayer(Predicate<Player> predicate);

	public void updatePlayerPrice(String name, double price);
}

public class AssignmentTwoManager {

		public static void main(String[] args) {
			
		}
}
