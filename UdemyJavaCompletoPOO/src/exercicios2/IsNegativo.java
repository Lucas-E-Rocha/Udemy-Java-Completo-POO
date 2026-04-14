package exercicios2;

import java.util.Scanner;

public class IsNegativo {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("Não negativo");
		}else{
			System.out.println("Negativo");
			};
			
		sc.close();
	}
}
