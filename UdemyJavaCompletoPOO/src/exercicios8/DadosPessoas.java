package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int arrayLength = sc.nextInt();
		double alturas[] = new double[arrayLength];
		char generos[] = new char[arrayLength];

		double menorAltura = 0;
		double maiorAltura = 0;
		int nHomens = 0;
		int nMulheres = 0;
		double totalAlturasF = 0;

		for (int i = 0; i < arrayLength; i++) {
			System.out.print("Altura da " + (1 + i) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (1 + i) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);

			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			} else if (i == 0) {
				menorAltura = alturas[i];
			}

			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (generos[i] == 'M') {
				nHomens++;
			} else if (generos[i] == 'F') {
				totalAlturasF += alturas[i];
				nMulheres++;
			}
		}

		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", totalAlturasF / nMulheres);
		System.out.println("Numero de homens = " + nHomens);

		sc.close();
	}
}
