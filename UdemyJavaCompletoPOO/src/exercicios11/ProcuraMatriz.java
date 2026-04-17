package exercicios11;

import java.util.Scanner;

public class ProcuraMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("insira as dimensões da matriz (separadas apenas por espaço):");
		int n = sc.nextInt(), m = sc.nextInt();
		int matriz[][] = new int[n][m];

		System.out.println("\ninsira os valores de cada linha (separados apenas por espaço):");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nInsira o valor para procurar:");
		int numeroProcurado = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (numeroProcurado == matriz[i][j]) {
					System.out.println("\nPosition: " + i + "," + j);
					if (j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j + 1 < m) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i - 1 < n) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
