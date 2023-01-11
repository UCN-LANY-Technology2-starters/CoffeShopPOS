package model;

public class Orderline {

	private Product product;
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Orderline(Product product, int quantity) {
		
		this.product = product;
		this.quantity = quantity;
	}
}
