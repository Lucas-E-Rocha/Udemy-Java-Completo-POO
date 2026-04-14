package exercicios5.Ex3.Program;

import java.util.Locale;
import java.util.Scanner;

import exercicios5.Ex3.Entities.Student;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student's name:");
		student.name = sc.nextLine();
		System.out.println("Enter the student's first grade:");
		student.grade1 = sc.nextDouble();
		System.out.println("Enter the student's second grade:");
		student.grade2 = sc.nextDouble();
		System.out.println("Enter the student's third grade:");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",student.finalGrade());
		
		System.out.printf(student.isPassed()? "PASS":"FAILED %nMISSING %.2f POINTS",60-student.finalGrade());
		
		sc.close();
	}

}
