package exercicios6.util;

public class CurrencyConverter {
	static double iof = 0.06;
	
	public static double calculateFinalPrice(double dollarPrice,double nDollars) {
		return (dollarPrice+dollarPrice*iof)*nDollars;
	}

}