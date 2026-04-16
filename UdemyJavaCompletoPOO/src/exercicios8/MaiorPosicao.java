package exercicios8;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		double[] numeros = new double[sc.nextInt()];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double maior = 0;
		String posicaoMaiores = "";
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicaoMaiores = ""+i;
			}else if(numeros[i] == maior) {
				posicaoMaiores += " "+i;
			}
		}
		
		System.out.println("Maior Valor = " + maior);
		String posicao = posicaoMaiores.contains(" ") ? "Posicões do maior valor: " + posicaoMaiores
													  : "Posicão do maior valor: "+ posicaoMaiores;
		System.out.println(posicao);
		
		sc.close();
	}
}
