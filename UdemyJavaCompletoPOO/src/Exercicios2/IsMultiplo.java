package Exercicios2;

import java.util.Scanner;

public class IsMultiplo {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número:");
		n1 = sc.nextInt();
		System.out.println("Insira o segundo número:");
		n2 = sc.nextInt();
		
		if(n1%n2 == 0 || n2%n1 == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}
}
