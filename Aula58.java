import java.util.Locale;
import java.util.Scanner;

public class Aula58 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000; // 0b indica que é um numero binário
		System.out.println(mask);
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
