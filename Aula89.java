import java.util.Locale;
import java.util.Scanner;

public class Aula89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vect = new double[N];
		double sum = 0;
		for(int i = 0; i <N; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		sum = sum/N;
		System.out.printf("AVERAGE HEIGHT = %.2f", sum);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
