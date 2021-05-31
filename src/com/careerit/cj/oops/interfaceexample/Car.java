package com.careerit.cj.oops.interfaceexample;

public class Car extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName()+" game, please seat belt ....");
	}

}
