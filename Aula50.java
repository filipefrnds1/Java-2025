import java.util.Locale;
import java.util.Scanner;

public class Aula50 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int soma = 0;
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		System.out.println(soma);
		
		
		
		sc.close();

	}

}
