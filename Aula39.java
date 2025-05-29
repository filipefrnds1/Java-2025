import java.util.Locale;
import java.util.Scanner;

public class Aula39 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		String dia;
		switch(valor) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terça";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5: 
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7: 
				dia = "sábado";
				break;
			default:
				dia = "valor inválido";
				break;
		}
		
		System.out.println("O dia da semana é " + dia);
sc.close();
	}

}
