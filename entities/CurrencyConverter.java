package entities;

public class CurrencyConverter {
	
	public double priceD;
	public double dollars;
	
	public double calcConverter(double price, double dollar) {
		return ((price * dollar) * 0.06) + (price * dollar);
	}

}
