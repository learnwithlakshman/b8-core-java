package com.careerit.cj.oops.ipl;

public class Player {

	private String name;
	private String role;
	private String country;
	private String team;
	private double price;

	public Player() {
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

	public String getCountry() {
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
	
	

}
