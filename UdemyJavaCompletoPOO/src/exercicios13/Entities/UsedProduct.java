package exercicios13.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	Date manufactureDate;

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + String.format("%.2f", this.getPrice()) + 
				" (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

}
