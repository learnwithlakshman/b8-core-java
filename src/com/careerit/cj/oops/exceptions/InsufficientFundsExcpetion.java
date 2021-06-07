package com.careerit.cj.oops.exceptions;

public class InsufficientFundsExcpetion extends  Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public InsufficientFundsExcpetion() {
		this.message = "You may not have enough funds to withdraw";
	}

	public InsufficientFundsExcpetion(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("InsufficientFundsExcpetion [message=%s]", message);
	}

	
}
