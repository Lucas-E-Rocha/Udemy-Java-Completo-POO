package Exercicios1;
import java.util.Scanner;

public class DiferencaProdutos {
	public static void main(String[] args) {
		int A,B,C,D,diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para A:");
		A = sc.nextInt();
		System.out.println("Digite o valor para B:");
		B = sc.nextInt();
		System.out.println("Digite o valor para C:");
		C = sc.nextInt();
		System.out.println("Digite o valor para D:");
		D = sc.nextInt();
		
		diferenca = (A*B)-(C*D);
		
		System.out.println("Diferenca: " + diferenca);
		
		sc.close();
	}
}
