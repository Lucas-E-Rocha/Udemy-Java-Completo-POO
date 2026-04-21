package exercicios14.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios14.Entities.Company;
import exercicios14.Entities.Individual;
import exercicios14.Entities.TaxPayer;

public class aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int nTaxPayers = sc.nextInt();

		for (int i = 1; i <= nTaxPayers; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			String type = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			switch (type) {
			case "i":
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case "c":
				System.out.print("Numer of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			default:
				break;
			}
		}

		double totalTax = 0;
		System.out.println("\nTAXES PAID:");
		for (TaxPayer taxPayer : taxPayers) {
			totalTax += taxPayer.tax();
			System.out.println(taxPayer.toString());
		}

		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));

		sc.close();
	}
}
