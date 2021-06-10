package com.careerit.cj.oops.interfaceexample;

public abstract class AbstractGame implements Game {

	@Override
	public void start() {
		System.out.println("The game "+this.getClass().getSimpleName()+" is going start");
	}

	@Override
	public void stop() {
		System.out.println("The game "+this.getClass().getSimpleName()+" is going stop");
		
	}
}
