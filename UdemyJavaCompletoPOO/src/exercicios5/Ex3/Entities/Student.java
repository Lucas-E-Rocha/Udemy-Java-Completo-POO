package exercicios5.Ex3.Entities;

public class Student {
	public String name;
	public double grade1 = 0;
	public double grade2 = 0;
	public double grade3 = 0;
	
	public double finalGrade() {
		return grade1+grade2+grade3;
	}
	
	public boolean isPassed() {
		if(finalGrade() >= 60) {
			return true;
		} else return false;
	}
	
}
