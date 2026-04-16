package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("Digite o raio do circulo:");
		raio = sc.nextDouble();
		
		area = Math.pow(raio,2)*Math.PI;
		System.out.printf("Área = %.4f%n", area);
		
		sc.close();
	}
}
