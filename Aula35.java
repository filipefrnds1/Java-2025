import java.util.Locale;
import java.util.Scanner;

public class Aula35 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas Horas? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			
			if(hora < 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
		//System.out.println("Boa noite");
		sc.close();
	}

}
