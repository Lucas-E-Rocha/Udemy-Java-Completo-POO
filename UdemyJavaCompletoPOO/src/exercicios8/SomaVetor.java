package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		double[] numeros = new double[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%.1f ", numeros[i]);
		}
		
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		System.out.printf("\nSoma = %.2f%n", soma);
		
		System.out.printf("Media = %.2f%n", soma/numeros.length);
		
		sc.close();
	}
}
