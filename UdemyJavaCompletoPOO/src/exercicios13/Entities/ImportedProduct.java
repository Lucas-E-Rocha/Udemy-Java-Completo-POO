package exercicios13.Entities;

public class ImportedProduct extends Product {
	private double customsFee;

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return this.getName() + " $ " + String.format("%.2f", totalPrice()) 
		+ " (Customs fee: $ "+ String.format("%.2f", customsFee)+")";
	}

	public double totalPrice() {
		return this.getPrice() + customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
}
