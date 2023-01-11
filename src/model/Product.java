package model;

public class Product {

	private String name; 
	private String description;
	private double price;
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
	
	public Product(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
}
