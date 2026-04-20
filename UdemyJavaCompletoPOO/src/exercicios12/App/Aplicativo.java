package exercicios12.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicios12.Entities.Client;
import exercicios12.Entities.Order;
import exercicios12.Entities.OrderItem;
import exercicios12.Entities.Product;
import exercicios12.Entities.Enums.OrderStatus;

public class Aplicativo {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("\033[1mEnter client data:\033[0m");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());

		Client cliente = new Client(name, email, birthDate);

		System.out.println("\033[1mEnter order data:\033[0m");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
		Order order = new Order(orderStatus, cliente);

		System.out.print("How many items to this order?");
		int nItems = sc.nextInt();
		for (int i = 1; i <= nItems; i++) {
			System.out.println("\033[1mEnter #" + i + " item data:\033[0m");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Produt price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println("\n" + order);

		sc.close();
	}
}
