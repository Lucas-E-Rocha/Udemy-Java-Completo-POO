package exercicios4;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		int n,resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor para achar o fatorial");
		n = sc.nextInt();
		if(n == 0) {
			System.out.println(1);
		}else {
			resultado = n;
			for (int i = 1; i < n; i++) {
				resultado = resultado*(n-i);
			}
			System.out.println(resultado);
		}
		sc.close();
	}
}
