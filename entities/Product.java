package entities;

public class Product {

	private String name;  // private: o membro só pode ser acessado na própria classe
	private double price; // quando a variavel não tem nada por exemplo String name;
	private int quantity; // ela só pode ser acessada pelo próprio pacote
	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return quantity*price;
	}
	
	public void addProducts(int quant) {
		quantity += quant;
	}
	
	public void removeProducts(int quant) {
		quantity -= quant;
	}
	
	public String toString() {
		return  name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
	
}
