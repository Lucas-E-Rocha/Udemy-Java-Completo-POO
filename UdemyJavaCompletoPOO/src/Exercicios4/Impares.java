package Exercicios4;

import java.util.Scanner;

public class Impares {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor de 1 até 1000:");
		x = sc.nextInt();
		if(x < 1 || x > 1000) {
			System.out.println("Numero inválido");
		}else {
			for(int i=0; i<=x; i++) {
				if(i%2 != 0) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}
