package exercicios5.Ex2.App;

import java.util.Locale;
import java.util.Scanner;

import exercicios5.Ex2.Entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: "+employee.name+", $ %.2f%n",employee.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated data: "+employee.name+", $ %.2f%n",employee.netSalary());

		sc.close();
	}
}
