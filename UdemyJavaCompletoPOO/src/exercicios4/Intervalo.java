package exercicios4;

import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		int n,in=0,out=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre a quantidade de valores que deseja inserir:");
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Insira o próximo valor:");
			int valor = sc.nextInt();
			if(valor >=10 && valor <= 20) {
				in++;
			}else out++;
		}

		System.out.println(in +" in\n"
						  +out+" out");
		
		sc.close();
	}
}
