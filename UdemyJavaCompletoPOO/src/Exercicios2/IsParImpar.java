package Exercicios2;

import java.util.Scanner;

public class IsParImpar {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
}
