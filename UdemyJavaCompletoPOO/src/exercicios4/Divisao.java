package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nPares;
		
		System.out.println("Insira quantas divisões serão realizadas:");
		nPares = sc.nextInt();
		
		for (int i = 0; i < nPares; i++) {
			System.out.println("Insira o nominador:");
			double x = sc.nextInt();
			System.out.println("Insira o denominador:");
			double y = sc.nextInt();
			if(y != 0) {
			System.out.println(x/y);
			}else System.out.println("divisão impossível");
		}
		sc.close();
	}
}
