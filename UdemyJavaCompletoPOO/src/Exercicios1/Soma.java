package Exercicios1;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro digito:");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo digito:");
		n2 = sc.nextInt();
		
		soma = n1+n2;
		System.out.println("soma:" + soma);
		
		sc.close();

	}
}