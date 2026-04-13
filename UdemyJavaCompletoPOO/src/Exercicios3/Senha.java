package Exercicios3;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		int senhaValida,senha;
		boolean isSenhaValida = false;
		Scanner sc = new Scanner(System.in);
		
		senhaValida = 2002;
		
		while(!isSenhaValida) {
			System.out.println("Insira a senha:");
			senha = sc.nextInt();
			if(senha == senhaValida) {
				isSenhaValida = true;
				System.out.println("Acesso Permitido");
			}else System.out.println("Senha Invalida");
		}
		
		sc.close();
	}
}
