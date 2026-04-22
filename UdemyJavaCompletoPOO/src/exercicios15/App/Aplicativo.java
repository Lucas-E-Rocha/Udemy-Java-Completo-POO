package exercicios15.App;

import java.util.Locale;
import java.util.Scanner;

import exercicios15.Entities.Account;
import exercicios15.Entities.Exceptions.BalanceException;

public class Aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.print("\nEnter amount for withdraw: ");
		try {
			account.withdraw(sc.nextDouble());
			System.out.printf("New balance : %.2f", account.getBalance());
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
