package exercicios8.Alturas.app;

import java.util.Locale;
import java.util.Scanner;

import exercicios8.Alturas.entities.Pessoa;

public class Aplicativo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double alturaTotal = 0;

		System.out.println("Quantas pessoas serão registradas?");
		Pessoa[] pessoas = new Pessoa[sc.nextInt()];
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			pessoa.setNome(sc.next());
			System.out.print("Idade: ");
			pessoa.setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoa.setAltura(sc.nextDouble());
			alturaTotal += pessoa.getAltura();
			pessoas[i] = pessoa;
		}

		System.out.printf("\nAltura média: %.2f%n", alturaTotal / pessoas.length);

		double menor16 = 0;
		String menores = "";
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 16) {
				menor16++;
				menores += pessoa.getNome() + "\n";
			}
		}
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", (menor16 / pessoas.length) * 100);
		System.out.println(menores);

		sc.close();
	}
}
