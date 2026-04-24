package exercicios16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios16.entities.Product;

public class Aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = registerProducts(sc);

		File productsCSV = createProductsCSV(products, sc);

		createSummaryCSV(productsCSV);

		sc.close();
	}

	private static List<Product> registerProducts(Scanner sc) {
		System.out.println("Enter how many products you want to register:");
		int nProducts = sc.nextInt();

		List<Product> products = new ArrayList<>();

		for (int i = 1; i <= nProducts; i++) {
			System.out.println("\nEnter the data for product #" + i);
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Price: ");
			double price = sc.nextDouble();
			System.out.printf("Quantity: ");
			int quantity = sc.nextInt();
			products.add(new Product(name, price, quantity));
		}

		return products;
	}

	private static File createProductsCSV(List<Product> products, Scanner sc) {
		System.out.println("\nEnter the file path for the products:");
		sc.nextLine();
		String productsPath = sc.nextLine() + "\\products.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(productsPath))) {
			for (Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		File productsCSV = new File(productsPath);

		return productsCSV;
	}

	private static void createSummaryCSV(File productsCSV) {
		new File(productsCSV.getParent() + "\\out").mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(productsCSV.getPath()));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(productsCSV.getParent() + "\\out\\summary.csv"));) {
			String line = br.readLine();
			while (line != null) {
				String[] productValues = line.split(",");

				String name = productValues[0];
				double value = Double.parseDouble(productValues[1]);
				int quantity = Integer.parseInt(productValues[2]);

				double totalValue = value * quantity;

				bw.write(name + "," + String.format("%.2f", totalValue));
				bw.newLine();

				line = br.readLine();

			}
			System.out.println("Summary Created!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
