package exercicios18.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aplicativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> alunosA = new HashSet<>();
		Set<Integer> alunosB = new HashSet<>();
		Set<Integer> alunosC = new HashSet<>();

		Set<Integer> uniqueStudents = new HashSet<>();

		System.out.printf("How many students for course A? ");
		int nStudentsA = sc.nextInt();
		for (int i = 0; i < nStudentsA; i++) {
			alunosA.add(sc.nextInt());
		}

		System.out.printf("How many students for course B? ");
		int nStudentsB = sc.nextInt();
		for (int i = 0; i < nStudentsB; i++) {
			alunosB.add(sc.nextInt());
		}

		System.out.printf("How many students for course C? ");
		int nStudentsC = sc.nextInt();
		for (int i = 0; i < nStudentsC; i++) {
			alunosC.add(sc.nextInt());
		}

		uniqueStudents.addAll(alunosA);
		uniqueStudents.addAll(alunosB);
		uniqueStudents.addAll(alunosC);

		System.out.println("Totla students: " + uniqueStudents.size());
		
		sc.close();
	}
}
