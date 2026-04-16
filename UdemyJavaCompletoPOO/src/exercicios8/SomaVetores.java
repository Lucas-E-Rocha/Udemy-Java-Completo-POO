package exercicios8;

import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int[] vetorA = new int[sc.nextInt()];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		int[] vetorC = new int[vetorA.length];
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		

	}
}
