package com.careerit.cj.oops.ipl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class CsvReaderUtil {

	private CsvReaderUtil() {
	}

	public static Player[] loadPlayers() {
		Player[] arr = new Player[] {};
		try {
			List<String> lines = Files.readAllLines(Paths.get("ipl_2021.csv"));
			arr = convertLineToPlayer(lines.subList(1, lines.size()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}

	private static Player[] convertLineToPlayer(List<String> subList) {

		Player[] players = new Player[subList.size()];

		int count = 0;
		for (String str : subList) {
			String[] arr = str.split(",");
			int i = 0;
			String name = arr[i++];
			String role = arr[i++];
			String country = arr[i++];
			String team = arr[i++];
			double price = Double.parseDouble(arr[i++]);
			Player player = new Player(name, role, country, team, price);
			players[count++] = player;
		}
		return players;
	}
}
