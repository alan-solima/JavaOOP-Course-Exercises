package util;

public class CurrencyConverter {
	
	public static double tax = 6;
	public static double dollarPrice, dollarBought, amount;
	
	public static void calc() {
		amount = (dollarBought + dollarBought*(tax/100)) * dollarPrice;
	}
}
