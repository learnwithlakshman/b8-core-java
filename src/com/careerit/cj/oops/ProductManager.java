package com.careerit.cj.oops;

class Product {

	private int pid;
	private String name;
	private double price;

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class ProductManager {

	public static void main(String[] args) {
		String data = "1001-Dell XPS-65000,1002-Sony ABC-45000,1003-Mac Airbook-67000,1004-HP-89000,1005-Mac Thinkpad-87000,1008-OnePlus-87000";
		
		
		// Get max priced product
		
		// Get Average price of the product
		
		// Display products, the price less than average price
		
		// Update products with  10% discount, the products which have price more 60000 
	
		// Display all the product information 
		
	}
}
