package exercicios8;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int[] numeros = new int[sc.nextInt()];
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		for(int i = 0; i<numeros.length;i++) {
			if(numeros[i] < 0)
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}
}
