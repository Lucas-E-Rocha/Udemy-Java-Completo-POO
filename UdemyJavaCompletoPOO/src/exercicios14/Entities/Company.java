package exercicios14.Entities;

public class Company extends TaxPayer {
	private int numberOfEmployees;

	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		
		double tax;

		if (numberOfEmployees < 10) {
			tax = getAnualIncome() * 0.16;
		} else {
			tax = getAnualIncome() * 0.14;
		}

		return tax;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
