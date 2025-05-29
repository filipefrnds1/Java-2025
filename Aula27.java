import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // o enter da uma quebra de linha, fica pendente, o s1 = sc.nextLine(); consumiu a quebra de linha
		sc.nextLine(); // serve pra consumir a quebra de linha apos um nextInt ou nextDouble e por ai vai.
		s1 = sc.nextLine(); 
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
