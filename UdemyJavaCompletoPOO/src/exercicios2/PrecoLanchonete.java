package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class PrecoLanchonete {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int id,qtdItem;
		double valorTotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o código do item:");
		id = sc.nextInt();
		System.out.println("Insira a quantidade do item:");
		qtdItem = sc.nextInt();
		
		switch (id) {
		case 1: { //Cachorro quente
			valorTotal = qtdItem*4;
			break;
		}
		case 2: { //X-Salada
			valorTotal = qtdItem*4.5;
			break;
		}
		case 3: { //X-Bacon
			valorTotal = qtdItem*5;
			break;
		}
		case 4: { //Torrada Simples
			valorTotal = qtdItem*2;
			break;
		}
		case 5: { //Refrigerante
			valorTotal = qtdItem*1.5;
			break;
		}
		default:
			sc.close();
			throw new IllegalArgumentException("Código inválido: " + id);
		}
		System.out.printf("Total: R$ %.2f%n",valorTotal);
		
		sc.close();
	}
}
