package exercicios20.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicios20.entities.Employee;

public class Aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			System.out.printf("Enter salary: ");
			double baseSalary = sc.nextDouble();

			List<Employee> employees = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String fields[] = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			List<String> emailsOrdered = employees.stream().filter(e -> e.getSalary() > baseSalary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());

			double totalMSalary = employees.stream().filter(e -> e.getName().toUpperCase().startsWith("M"))
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);

			System.out.printf("Email of people whose salary is more than %.2f: \n", baseSalary);
			emailsOrdered.forEach(System.out::println);
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f",totalMSalary);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
	}
}
