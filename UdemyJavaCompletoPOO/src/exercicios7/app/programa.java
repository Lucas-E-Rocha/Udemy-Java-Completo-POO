package exercicios7.app;

import java.util.Locale;
import java.util.Scanner;

import exercicios7.entities.ContaBancaria;

public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int accountNumber;
		String accountHolder;
		ContaBancaria contaBancaria;

		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n): ");
		if (sc.next().equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			 contaBancaria = new ContaBancaria(accountNumber, accountHolder, initialDeposit);
		} else {
			 contaBancaria = new ContaBancaria(accountNumber, accountHolder);
		}
		System.out.println("\nAccount Data: "
						+ "\n"+contaBancaria.toString());
		
		System.out.print("\nEnter a deposit value: ");
		contaBancaria.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(contaBancaria.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		contaBancaria.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(contaBancaria.toString());
		
		sc.close();
	}
}
