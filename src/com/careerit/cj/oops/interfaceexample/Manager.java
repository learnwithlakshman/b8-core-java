package com.careerit.cj.oops.interfaceexample;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Bike 2.Car 3.Ship");
		int ch = sc.nextInt();
		Game game = getSelectedGame(ch);
		game.start();
		game.play();
		game.stop();
		sc.close();
	}

	private static Game getSelectedGame(int ch) {

		if (ch == 1) {
			return new Bike();
		} else if (ch == 2) {
			return new Car();
		} else if (ch == 3) {
			return new Ship();
		}
		throw new IllegalArgumentException("We don't support the given game type:" + ch);
	}

}
