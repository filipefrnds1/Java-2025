package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ExerAula70rect {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rec.Area());
		System.out.printf("PERIMETER = %.2f%n", rec.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.Diagonal());
		
		sc.close();
	}

}
