package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int vetor[] = new int[sc.nextInt()];

		int totalPares = 0;
		int nPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				totalPares += vetor[i];
				nPares++;
			}
		}
		
		if(nPares > 0) {
			System.out.println("MEDIA DOS PARES = " + (double)totalPares/nPares);
		} else System.out.println("NENHUM NUMERO PAR");
		
		sc.close();
	}
}
