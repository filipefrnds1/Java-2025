import java.util.Locale;
import java.util.Scanner;

public class Aula64 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		double p1 = (a1+b1+c1) / 2.0;
		double pf1 = p1*(p1-a1)*(p1-b1)*(p1-c1);
		double area1 = Math.sqrt(pf1);
		
		System.out.println("Enter the measures of triangle Y: ");
		double a2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double p2 = (a2+b2+c2) / 2.0;
		double pf2 = p2*(p2-a2)*(p2-b2)*(p2-c2);
		double area2 = Math.sqrt(pf2);
		
		System.out.printf("Triangle X area: %.4f%n", area1);
		System.out.printf("Triangle Y area: %.4f%n", area2);
		
		if(area1 > area2) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
