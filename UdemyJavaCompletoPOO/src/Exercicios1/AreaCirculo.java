package Exercicios1;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		double raio;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		raio = sc.nextDouble();
		
		area = Math.pow(raio,2)*Math.PI;
		System.out.printf("Área = %.4f%n", area);
		
		sc.close();
	}
}
