package oon.faktura;

public class Product {
	private int iD;
	private String name;
	private double price;
	private int piecesInStock;

	public Product(int iD, String name, double price, int piecesInStock) {
		this.iD = iD;
		this.name = name;
		this.price = price;
		this.piecesInStock += piecesInStock;

	}

	public String getName() {
		return name;
	}

	public int getPiecesInStock() {
		return piecesInStock;
	}

	@Override
	public String toString() {
		return "Product [ID = " + iD + " name= " + name + ", price= " + price + ", piecesInStock= " + piecesInStock
				+ "]";
	}

	public double getPrice() {
		return price;
	}

}
