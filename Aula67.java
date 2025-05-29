import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Aula67 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.setName(sc.nextLine());
		//prod.name = sc.nextLine();
		
		System.out.print("Price: ");
		prod.setPrice(sc.nextDouble());
		//prod.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		prod.setQuantity(sc.nextInt());
		//prod.quantity = sc.nextInt();
		System.out.println();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", prod.getName(), prod.getPrice(), prod.getQuantity(), prod.totalValueInStock());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		System.out.println();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", prod.getName(), prod.getPrice(), prod.getQuantity(), prod.totalValueInStock());
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());
		System.out.println();
		
		System.out.println(prod.toString());
		
		
		sc.close();

	}

}
