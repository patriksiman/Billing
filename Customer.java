package oon.faktura;

public class Customer {

	private Adress adress1;
	private String phoneNumber;
	private String company;
	private String name;

	public Customer(String company, String phoneNumber) {

		this.company = company;
		this.phoneNumber = phoneNumber;

	}

	@Override
	public String toString() {
		return "Customer [Company: " + company + ", Name: " + name + " Phone: " + phoneNumber + " Adress: " + adress1
				+ "]";
	}

	public void setAdress1(String name, String street, String city, int postCode) {
		Adress adress1 = new Adress(name, street, city, postCode);
		this.adress1 = adress1;

	}

	public Adress getAdress1() {
		return adress1;
	}
}
