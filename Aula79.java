import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Aula79 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Product prod = new Product();
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.setName(sc.nextLine());
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		prod.setPrice(price);
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		prod.setQuantity(quantity);
		
		
		sc.close();
	}

}
