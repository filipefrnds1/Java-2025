import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Aula71 {
	
	public static final double PI = 3.14159; // padrão para constantes, obs: nome da variavel é maiúsculo

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		sc.close();

	}
	
	public static double circumference(double radius) { // O método main não pode chamar um metodo que não é static 
		return 2.0 * PI * radius;						// dentro de outro que não é static
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
