package Exercicios3;

import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		int opcao = 0,alcool = 0,gasolina = 0,diesel = 0;
		Scanner sc = new Scanner(System.in);
		
		while(opcao != 4) {
			System.out.println("Insira a opção desejada: \n"
							+ "1.Álcool" +"\n"
							+ "2.Gasolina" +"\n"
							+ "3.Diesel" +"\n"
							+ "4.Fim");
			opcao = sc.nextInt();			
			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("Muito obrigado \n"
						+ "Álcool: " + alcool +"\n"
						+ "Gasolina: " + gasolina +"\n"
						+ "Diesel: " + diesel +"\n"
						);
				break;
			default:
				System.out.println("Opção inválida, tente outra vez:");
			}
		}
		sc.close();
	}
}
