package oon.faktura;

public class BillTester {

	public static void main(String[] args) {

		// Product heater = new Product("Heater", 50.0, 10);
		// Product fridge = new Product("Fridge", 200.0, 5);
		// Product laptop = new Product("Laptop", 499.9, 3);

		Customer customer = new Customer("xyz company", "1234567890");
		customer.setAdress1("CompanyXYC", "Dolná 333", "Horná Dolná", 12345);
		Bill bill = new Bill(customer);

		// bill.add(heater, 2);
		// bill.add(laptop, 2);
		// bill.add(fridge, 1);

		System.out.println(bill.format());
		// System.err.println(customer);

	}

}
