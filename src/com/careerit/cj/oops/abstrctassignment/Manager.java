package com.careerit.cj.oops.abstrctassignment;

abstract class Instrument {
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is going start");
	}

	public abstract void play();

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is going stop");
	}
}

// Create three instruments classes override play method, store randomly 10 instruments object into array play the instrument one by one
//   1. Guitar
//   2. Piano
//   3. Flute
// Hint: Use ThreadLocalRandom 

public class Manager {

	public static void main(String[] args) {
		Instrument[] arr = new Instrument[10];
		
		
		
	}
}
