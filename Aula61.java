import java.util.Locale;
import java.util.Scanner;

public class Aula61 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double y = 25.0;
		double x = Math.sqrt(y);
		
		System.out.println(x);
		
		System.out.println("Enter three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = 0;
		
		int higher = max(n1,n2,n3);
		
		showResult(higher);
		
		if(n1 > n2 && n1 > n3) {
				n4 = n1;
		}else if(n2 > n3) {
				n4 = n2;
		}else {
				n4 = n3;
		}
		
		
		
		System.out.println("Higher = " + n4);
		
		
		
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
			
		}else if(y > z) {
			aux = y;
			
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int ret) {
		System.out.println("Higher = " + ret);
	}

}
