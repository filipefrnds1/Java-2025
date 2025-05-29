import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = 25;
		int x;
		double y = 10.35784;
		String name = "Maria";
		
		System.out.print("Informe o valor de x: ");
		x = sc.nextInt();
		System.out.println(idade);
		System.out.println("Olá Mundo!");
		System.out.printf("%.2f%n", y);
		System.out.println(x);
		System.out.println("Resultado = " + (x+y) + " Metros");
		System.out.printf("RESOLTADO = %.2f Metros%n", (x+y));
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, idade, (x+y));
		sc.close();
		
	}

}
