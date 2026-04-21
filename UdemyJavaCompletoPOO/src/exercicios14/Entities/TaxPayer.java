package exercicios14.Entities;

public abstract class TaxPayer {
	private String name;
	private double anualIncome;
	
	public TaxPayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public abstract double tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	@Override
	public String toString() {
		return name +": $ " + String.format("%.2f",tax());
	}
}
