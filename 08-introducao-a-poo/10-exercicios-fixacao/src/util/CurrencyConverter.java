package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double price, double dollarsQuantity) {
		return price * dollarsQuantity + (price * dollarsQuantity) * IOF;
	}
}
