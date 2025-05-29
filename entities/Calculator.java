package entities;

public class Calculator {
	
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) { // O método main não pode chamar um metodo que não é static 
		return 2.0 * PI * radius;						// dentro de outro que não é static
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}

