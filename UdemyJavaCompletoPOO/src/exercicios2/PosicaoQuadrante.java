package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class PosicaoQuadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;

		System.out.println("Insira a coordenada x:");
		x = sc.nextDouble();
		System.out.println("Insira a coordenada y:");
		y = sc.nextDouble();

		if(x == 0 && y ==0) {
			System.out.println("Origem");
		}else if(x == 0) {
			System.out.println("Eixo Y");
		}else if(y == 0) {
			System.out.println("Eixo X");
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
