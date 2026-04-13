package Exercicios1;
import java.util.Scanner;

public class Funcionario {
	public static void main(String[] args) {
		int id,horasTrab;
		double valorHora,salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário");
		id = sc.nextInt();
		System.out.println("Digite as horas trabalhadas:");
		horasTrab = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora:");
		valorHora = sc.nextDouble();
		
		salario = valorHora*horasTrab;
		System.out.printf("NUMBER = " + id + "\n");
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
	}
