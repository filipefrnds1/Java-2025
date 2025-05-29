import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Aula76 {

	public static void main(String[] args) {
		// É uma operação especial da classe, que executa no momento da instanciação do
		// objeto
		// Usos comuns: iniciar valores dos atributos, permitir ou obrigar que o objeto
		// receba dados /
		// dependências no momento da sua instanciação ( injeção de dependência)
		// se um construtor customizado não for especificado, a classe disponibiliza o
		// construtor padrão:
		// Product p = new Product();
		// é possível especificar mais de um construtor na mesma classe(sobrecarga)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
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
		/*System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product prod = new Product(name, price);
		*/
		System.out.println();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f", prod.getName(), prod.getPrice(), prod.getQuantity(), prod.totalValueInStock());
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quant = sc.nextInt();
		prod.addProducts(quant);
		System.out.println();
		
		System.out.println("Updated data: " + prod);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		prod.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + prod);

		sc.close();

	}

}
