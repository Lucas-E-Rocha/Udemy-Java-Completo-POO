package exercicios8;

import java.util.Scanner;

public class MaisVelho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		String[] nomes = new String[sc.nextInt()];
		int[] idades = new int[nomes.length];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int posMaiorIdade = idades[0];
		int maiorIdade = 0;

		for (int i = 1; i < idades.length; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posMaiorIdade = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nomes[posMaiorIdade]);
		
		sc.close();
	}
}
