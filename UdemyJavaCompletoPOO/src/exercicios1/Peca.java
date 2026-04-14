package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class Peca {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int cod1,cod2,nPeca1,nPeca2;
		double valor1,valor2,valorPagar;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Registre a primeira peça:");
		System.out.println("Insira o codigo da peça");
		cod1 = sc.nextInt();
		System.out.println("Insira a quantidade");
		nPeca1 = sc.nextInt();
		System.out.println("Insira o valor unitário");
		valor1 = sc.nextDouble();
		
		System.out.println("Registre a segunda peça:");
		System.out.println("Insira o codigo da peça");
		cod2 = sc.nextInt();
		System.out.println("Insira a quantidade");
		nPeca2 = sc.nextInt();
		System.out.println("Insira o valor unitário");
		valor2 = sc.nextDouble();
		
		valorPagar = nPeca1*valor1 + nPeca2*valor2;

		System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);
		
		sc.close();
	}
}
