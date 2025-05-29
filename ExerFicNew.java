import java.util.Locale;
import java.util.Scanner;

public class ExerFicNew {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		
		char c;
		c = sc.next().charAt(0);
		System.out.println(c);
		
		String e;
		int r;
		double w;
		
		e = sc.next();
		r = sc.nextInt();
		w = sc.nextDouble();
		
		System.out.println(e);
		System.out.println(r);
		System.out.println(w);
		
		sc.close();

	}

}
