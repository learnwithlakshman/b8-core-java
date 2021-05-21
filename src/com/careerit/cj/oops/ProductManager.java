package com.careerit.cj.oops;

import java.text.NumberFormat;

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

		String data = "1001-Dell XPS-65000,1002-Sony ABC-45000,1003-Mac Airbook-67000,1004-HP-89000.987654,1005-Mac Thinkpad-87000,1008-OnePlus-89000.87654";

		String[] arr = data.split(",");
		Product[] products = getProducts(arr);

		// Get max priced product (s)

		double maxPrice = getMaxPrice(products);

		System.out.println("Maximum priced product(s): " + maxPrice);

		for (Product p : products) {
			if (p.getPrice() == maxPrice) {
				displayProudct(p);
			
			}
		}

		double totalPrice = getTotalPrice(products);
		double avgPrice = totalPrice / products.length;
		// Get Average price of the product
		System.out.println("Average price :" + avgPrice);
		// Display products, the price less than average price
		for (Product p : products) {
			if (p.getPrice() < avgPrice) {
				displayProudct(p);
			}
		}
		// Update products with 10% discount, the products which have price more 60000
		for (Product p : products) {
			if (p.getPrice() > 60000) {
				double updatedPrice = p.getPrice() - p.getPrice() * 0.1;
				p.setPrice(updatedPrice);
			}
		}
		// Display all the product information
		for (Product p : products) {
			displayProudct(p);
		}
		
	}

	private static void displayProudct(Product p) {
		 NumberFormat obj = NumberFormat.getInstance();
		 obj.setMaximumFractionDigits(3);
		System.out.println(p.getName().toUpperCase() + " " + p.getName() + " " + obj.format(p.getPrice()));
		
	}

	private static double getTotalPrice(Product[] products) {
		double total = 0;
		for (Product p : products) {
			total += p.getPrice();
		}
		return total;
	}

	private static double getMaxPrice(Product[] products) {
		double max = products[0].getPrice();
		for (Product p : products) {
			if (p.getPrice() > max) {
				max = p.getPrice();
			}
		}
		return max;
	}

	private static Product[] getProducts(String[] arr) {
		Product[] productArr = new Product[arr.length];
		int count = 0;
		for (String str : arr) {
			String[] pStr = str.split("-");
			int pid = Integer.parseInt(pStr[0]);
			String name = pStr[1];
			double price = Double.parseDouble(pStr[2]);
			Product product = new Product(pid, name, price);
			productArr[count++] = product;
		}
		return productArr;
	}
}
