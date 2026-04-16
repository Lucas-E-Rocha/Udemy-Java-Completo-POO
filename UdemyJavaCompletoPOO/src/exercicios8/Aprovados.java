package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int arrayLength = sc.nextInt();
		String[] nomes = new String[arrayLength];
		double[] nota1 = new double[arrayLength];
		double[] nota2 = new double[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (1 + i) + "o aluno");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < arrayLength; i++) {
			if ((nota1[i] + nota2[i]) / 2 >= 6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
}
