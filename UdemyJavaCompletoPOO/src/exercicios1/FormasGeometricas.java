package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class FormasGeometricas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double A,B,C;
		double areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor da face A");
		A = sc.nextDouble();
		System.out.println("Insira o valor da face B");
		B = sc.nextDouble();
		System.out.println("Insira o valor da face C");
		C = sc.nextDouble();
		
		areaTriangulo = (A*C)/2;
		areaCirculo = Math.pow(C, 2)*Math.PI;
		areaTrapezio = ((A+B)*C)/2;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A*B;
		
		System.out.printf(
				  "TRIANGULO: %.3f%n"
				+ "Circulo: %.3f%n"
				+ "Trapezio: %.3f%n"
				+ "Quadrado: %.3f%n"
				+ "Retangulo: %.3f%n"
				,areaTriangulo
				,areaCirculo
				,areaTrapezio
				,areaQuadrado
				,areaRetangulo);
		
		sc.close();
	}
}
