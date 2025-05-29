import java.util.Locale;
import java.util.Scanner;

public class Aula55 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char N;
		
		do {
			
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double fah = ((9*celsius)/5) + 32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", fah);
				
		System.out.print("Deseja repetir (s/n) ? ");		
		N = sc.next().charAt(0);
		
		}while(N != 'n');
		
		
		
		
		sc.close();
	}

}
