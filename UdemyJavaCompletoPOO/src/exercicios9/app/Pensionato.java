package exercicios9.app;

import java.util.Scanner;

import exercicios9.entities.Rent;

public class Pensionato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent rents[] = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int nRents = sc.nextInt();
		
		for (int i = 1; i <= nRents; i++) {
			System.out.println("Rent #" + (i));
			Rent rent = new Rent();

			System.out.print("Name: ");
			rent.setName(sc.next());

			System.out.print("Email: ");
			rent.setEmail(sc.next());

			System.out.print("Room: ");
			rent.setRoom(sc.nextInt());

			rents[rent.getRoom()] = rent;
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < rents.length; i++) {
			if (rents[i] != null) {
				System.out.println(rents[i].toString());
			}
		}
		sc.close();
	}
}
