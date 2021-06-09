package com.careerit.cj.collection.setex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Player {
	private String name;
	private String role;
	private String countr;
	private String team;
	private double price;

	Player() {
	}

	public Player(String name, String role, String countr, String team, double price) {
		this.name = name;
		this.role = role;
		this.countr = countr;
		this.team = team;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountr() {
		return countr;
	}

	public void setCountr(String countr) {
		this.countr = countr;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class PlayerManager {

	public static void main(String[] args) {
		List<Player> list = getPlayers();
		// Get all team names only
		// Count of teams
		
	}

	private static List<Player> getPlayers() {

		List<Player> list = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get("ipl_2021.csv"));
			for (int i = 1; i < lines.size(); i++) {
				String line = lines.get(i);
				String[] arr = line.split(",");
				int c = 0;
				String name = arr[c++];
				String role = arr[c++];
				String country = arr[c++];
				String team = arr[c++];
				double price = Double.parseDouble(arr[c++]);
				Player player = new Player(name, role, country, team, price);
				list.add(player);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

}
