package oon.faktura;

public class Item {

	private Product product;
	private int pieces;
	private double fullPrice;

	public Item(Product product, int pieces) {
		this.pieces = pieces;
		this.product = product;
		fullPrice = product.getPrice() * pieces;

	}

	public double getFullPrice() {
		return fullPrice;
	}

	public String format() {
		return String.format("%-30s%8.2f%10d%8.2f", product.getName(), product.getPrice(), pieces, getFullPrice());
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", pieces=" + pieces + ", fullPrice=" + fullPrice + "]";
	}

}
