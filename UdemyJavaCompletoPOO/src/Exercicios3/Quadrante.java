package Exercicios3;

import java.util.Scanner;

public class Quadrante {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Insira a coordenada X:");
			x = sc.nextInt();
			System.out.println("Insira a coordenada Y:");
			y = sc.nextInt();
			if(x == 0 || y == 0) {break;}
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
		}
		sc.close();
	}
}
