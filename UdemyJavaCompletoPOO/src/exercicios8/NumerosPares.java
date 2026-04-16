package exercicios8;

import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		int[] numeros = new int[sc.nextInt()];
		for (int i = 0 ; i < numeros.length;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES:");
		int nPares = 0;
		for (int i = 0 ; i < numeros.length;i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i]+ " ");
				nPares++;
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = "+nPares);
		
		sc.close();
	}
}
