package exercicios4;

import java.util.Scanner;

public class LinhasQuadradoCubo {
	public static void main(String[] args) {
		int nLinhas;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o número de linhas:");
		nLinhas = sc.nextInt();
		for (int i = 1; i <= nLinhas; i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
		}
		sc.close();
	}
}
