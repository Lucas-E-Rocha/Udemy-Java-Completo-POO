package exercicios4;

import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar os divisores:");
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}