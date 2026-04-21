package exercicios13.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios13.Entities.Product;
import exercicios13.Entities.ImportedProduct;
import exercicios13.Entities.UsedProduct;

public class Aplicativo {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int nProducts = sc.nextInt();

		for (int i = 1; i <= nProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			String type = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			switch (type) {
			case "c":
				products.add(new Product(name, price));
				break;
			case "u":
				System.out.print("Manufature Date (DD/MM/YYY): ");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.nextLine());
				products.add(new UsedProduct(name, price, manufactureDate));

				break;
			case "i":
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
				break;
			default:
				break;
			}
		}

		System.out.println("\nPRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
