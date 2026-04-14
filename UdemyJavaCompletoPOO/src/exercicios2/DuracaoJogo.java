package exercicios2;

import java.util.Scanner;

public class DuracaoJogo {
	public static void main(String[] args) {
		int horaInicial,horaFinal,duracao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a hora inicial:");
		horaInicial = sc.nextInt();
		System.out.println("Insira a hora final:");
		horaFinal = sc.nextInt();
		
		if(horaInicial >= horaFinal) {
			duracao = (horaFinal+24)-horaInicial;
		}else {
			duracao = horaFinal - horaInicial;
		}
		
		if(duracao == 1) {
			System.out.println("O jogo durou " + duracao + "Hora");
		}else {
			System.out.println("O jogo durou " + duracao + "Horas");
		}
		
		sc.close();
	}
}
