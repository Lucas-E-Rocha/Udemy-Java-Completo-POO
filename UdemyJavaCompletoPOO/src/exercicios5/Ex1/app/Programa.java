package exercicios5.Ex1.app;

import java.util.Locale;
import java.util.Scanner;

import exercicios5.Ex1.entidades.Rectangle;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();

		System.out.printf("Area: %.2f%n"
						+ "Perimeter: %.2f%n"
						+ "Diagonal: %.2f%n"
						,r.area()
						,r.perimeter()
						,r.diagonal());
		
		sc.close();
	}
}
