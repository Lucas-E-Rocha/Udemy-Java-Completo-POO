package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class CasosDeTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int nCasos;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira quantos casos de testes serão realizados:");
		nCasos = sc.nextInt();
		
		for(int i = 0; i<nCasos; i++) {
			System.out.println("insira o primeiro valor:");
			double x = sc.nextDouble();
			System.out.println("insira o segundo valor:");
			double y = sc.nextDouble();
			System.out.println("insira o terceiro valor:");
			double z = sc.nextDouble();
			System.out.printf("%.1f%n",(x*2+y*3+z*5)/10);
		}
		sc.close();
	}
}
