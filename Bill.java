package oon.faktura;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Bill {
	private List<Item> items;
	private Customer customer;

	public Bill(Customer customer) {
		this.customer = customer;
		items = new ArrayList<Item>();

	}

	public void add(Product product, int pieces) {

		if (product.getPiecesInStock() >= pieces) {

			Item newItem = new Item(product, pieces);
			items.add(newItem);
		}
	}

	public String format() {

		String output = "Bill °n " + generateBillNumber() + "\n" + customer.getAdress1().format()

				+ String.format("\n%-20s%15s%12s%10s", "Description", "Price", "Pieces", "   Full price\n");

		for (Item item : items) {
			output += item.format() + "\n";
		}

		output += String.format("\nPrice to be paid: %-8.2f €\n", getFullPrice());
		return output;
	}

	public long generateBillNumber() {

		Instant instant = Instant.now();
		long timeStampSeconds = instant.getEpochSecond();

		return timeStampSeconds;
	}

	private double getFullPrice() {
		double fullPrice = 0;

		for (Item item : items) {

			fullPrice += item.getFullPrice();

		}
		return fullPrice;

	}

}
