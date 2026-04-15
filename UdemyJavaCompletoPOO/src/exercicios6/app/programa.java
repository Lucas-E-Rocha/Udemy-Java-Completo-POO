package exercicios6.app;

import java.util.Locale;
import java.util.Scanner;

import exercicios6.util.CurrencyConverter;

public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice,nDollars;
		
		System.out.println("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		nDollars = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.calculateFinalPrice(dollarPrice, nDollars));
		sc.close();
	}
}
