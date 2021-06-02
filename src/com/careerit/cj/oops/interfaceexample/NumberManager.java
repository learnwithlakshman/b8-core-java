package com.careerit.cj.oops.interfaceexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Player {

	private String name;
	private double salary;
	private String team;

	public Player(String name, double salary, String team) {
		super();
		this.name = name;
		this.salary = salary;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String toString() {
		return String.format("Player [name=%s, salary=%s, team=%s]", name, salary, team);
	}

}

@FunctionalInterface
interface MyPredicate<T> {

	public boolean test(T t);

	default void hello() {

	}

}

interface MathOpe<T> {
	T operation(T a, T b);
}

class PlayerData {

	List<Player> players;

	public PlayerData() throws IOException {
		players = loadPlayers();
		System.out.println("Player count :" + players.size());
	}

	public void showPlayers(MyPredicate<Player> p) {
		for (Player player : players) {
			if (p.test(player)) {
				System.out.println(player);
			}
		}
	}

	private List<Player> loadPlayers() throws IOException {

		List<Player> list = new ArrayList<Player>();
		List<String> lines = Files.readAllLines(Paths.get("ipl_2021.csv")).stream().skip(1)
				.collect(Collectors.toList());
		for (String line : lines) {
			String[] arr = line.split(",");
			String name = arr[0];
			String team = arr[3];
			double salary = Double.parseDouble(arr[4]);
			Player player = new Player(name, salary, team);
			list.add(player);
		}
		return list;

	}

}



public class NumberManager {

	public static void main(String[] args) throws IOException {

		PlayerData obj = new PlayerData();
		obj.showPlayers((p) -> p.getTeam().equals("RCB"));
		System.out.println("--------------------- Players geeting more than 12_00_00_000 ----------------------");
		obj.showPlayers((p) -> p.getSalary() > 12_00_00_000);
		System.out.println("----------------------Player amount between 8_00_00_000 and 12_00_00_000 ----------");
		obj.showPlayers((p) -> p.getSalary() >= 8_00_00_000 && p.getSalary() <= 12_00_00_000);

		

	}
}
