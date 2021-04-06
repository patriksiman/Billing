package oon.faktura;

public class Adress {

	private String name;
	private String street;
	private String city;
	private int postCode;

	public Adress(String name, String street, String city, int postCode) {

		this.name = name;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	public String format() {
		return name + "\n" + street + "\n" + city + "\n" + postCode + "\n";
	}

	@Override
	public String toString() {
		return " Street:" + street + " City:" + city + " Postal code:" + postCode;
	}

}
