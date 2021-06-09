package com.careerit.cj.collection.setex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product{
	int pid;
	String pname;
	double price;
	Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Product [pid=%s, pname=%s, price=%s]", pid, pname, price);
	}
	@Override
	public int hashCode() {
		System.out.println("Hash code method is called:");
		return Objects.hash(pid, pname, price);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals method is called:");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return pid == other.pid && Objects.equals(pname, other.pname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
}

public class ProductManager {

		public static void main(String[] args) {
			Set<Product> set = new HashSet<>();
			Product p1 = new Product(1001, "Dell", 15000);
			Product p2 = new Product(1001, "Dell", 15000);
			Product p3 = p1;
			
			set.add(p1);
			set.add(p2);
			set.add(p3);
			
			
			System.out.println(set.size());
			
		}
}
