package com.careerit.cj.oops.overloading;
abstract class Game {

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " game is going start");
	}

	public abstract void play();
		
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " game is going stop");
	}
}

class Car extends Game {

	@Override
	public void play() {
	
	}
	
}
class Bike extends Game {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ship extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}

public class GameManager {

	public static void main(String[] args) {
		Game game = new Ship();
		game.start();
		game.play();
		game.stop();
	}
}
