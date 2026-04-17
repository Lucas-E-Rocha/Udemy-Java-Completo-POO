package exercicios10.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios10.Entities.Employee;

public class Salary {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int nEmployees = sc.nextInt();

		for (int i = 1; i <= nEmployees; i++) {
			System.out.println("Employee #" + i + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (findEmployee(employees, id) != null) {
				System.out.print("Id already registered. Please use a different id: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);

			employees.add(employee);
		}
		
		System.out.print("\nEnter the employee id that will have the salaray increased: ");
		int id = sc.nextInt();
		Employee employeeFound = findEmployee(employees, id);
		if(employeeFound != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeFound.increaseSalary(percentage);
		}else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("\nList of employees:");
		showEmployees(employees);
		sc.close();
	}

	private static void showEmployees(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee.toString()); 
		}
	}
	
	public static Employee findEmployee(List<Employee> employees, int id) {
		Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee;
	}
}
