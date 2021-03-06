package com.careerit.cj.collection.mapexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Player {
	private String name;
	private String role;
	private String country;
	private String team;
	private double price;

	Player() {
	}

	public Player(String name, String role, String country, String team, double price) {
		this.name = name;
		this.role = role;
		this.country = country;
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
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return String.format("Player [name=%s, role=%s, country=%s, team=%s, price=%s]", name, role, country, team,
				price);
	}
	

}

public class PlayerManager {

	public static void main(String[] args) {
		List<Player> list = getPlayers();
		System.out.println(list);
		// Please give team wise player details
		
		// Get players of given team CSK | RCB
		
		Map<String,List<Player>> map = new HashMap<>();
		
		for(Player p:list) {
			map.putIfAbsent(p.getTeam(), new ArrayList<Player>());
			map.get(p.getTeam()).add(p);
		}
		
		
		String teamName = "CSK";

		List<Player> playerList = map.get(teamName);
		System.out.println(playerList);
		
		
		
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
