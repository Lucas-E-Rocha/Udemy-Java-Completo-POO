package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		double[] vetor = new double[sc.nextInt()];
		
		double total = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			total += vetor[i];
		}

		double media = total/vetor.length;
		System.out.println("MEDIA DO VETOR = " + media);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}
