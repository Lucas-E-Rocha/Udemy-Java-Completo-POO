package Exercicios2;

import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {
		double salario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu salário:");
		salario = sc.nextDouble();
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}else if(salario > 2000 && salario <= 3000) {
			System.out.printf("R$ %.2f%n", (salario-2000)*0.08);
		}else if(salario > 3000 && salario <= 4500) {
			System.out.printf("R$ %.2f%n", 1000*0.08 + (salario-3000)*0.18);
		}else if(salario > 4500) {
			System.out.printf("R$ %.2f%n", 1000*0.08 + 1500*0.18 + (salario-4500)*0.28);
		}
		sc.close();
	}
}
