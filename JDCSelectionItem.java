package oon.faktura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDCSelectionItem {

	private static final Exception Exception = null;

	public static void main(String[] args) {

		// jdbc = protocol
		// mysql = service
		// localhost:3306 = url and port
		// stock = conrete database
		String url = "jdbc:mysql://localhost:3306/stock";
		String username = "****";
		String password = "****************";
		String insertName;
		Scanner scanner = new Scanner(System.in);
		// 1. create a connection to DB
		try (Connection connectionDB = DriverManager.getConnection(url, username, password);

				// 2. create object for commands
				Statement command = connectionDB.createStatement();) {
			// 3. create "select" command to print names of all books from table "book"
			System.out.println("Insert product name:");
			insertName = scanner.next();
			String selectCommand = "select * from products where product_name = '" + insertName + "'";

			ResultSet results = command.executeQuery(selectCommand);

			// 4. process the results and print the table in command line
			int notesNumber = 0;

			while (results.next()) {

				int id = results.getInt("id");
				String productName = results.getString("product_name");
				int piecesInStock = results.getInt("pieces");
				double price = results.getDouble("price");

				Product product = new Product(id, productName, price, piecesInStock);
				// print the readed products from table
				System.out.println("Insert pieces:");

				int pieces = scanner.nextInt();

				if (product.getPiecesInStock() < pieces) {

					throw Exception;
				}
				Item item = new Item(product, pieces);
				System.out.println(item);

				notesNumber++;

			}
			System.out.println("Readed:" + notesNumber);
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
