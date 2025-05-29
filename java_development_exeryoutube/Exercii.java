package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

public class Exercii {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Informe a largura do terreno com uma casa decimal: ");
		double largura = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Informe o comprimento de um terreno com uma casa decimal: ");
		double comprimento = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Informe o valor do metro quadrado do terreno com duas casas decimais: ");
		double metroQuadrado = sc.nextDouble();
		sc.nextLine();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		//=================================================
		
		int x = sc.nextInt();
		sc.nextLine();
			
		int y = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("SOMA = %d", x+y);
		
		
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f", area);
		
		
		
		int A, B, C, D;
		
		A = sc.nextInt();
		sc.nextLine();
		
		B = sc.nextInt();
		sc.nextLine();
		
		C = sc.nextInt();
		sc.nextLine();
		
		D = sc.nextInt();
		sc.nextLine();
		
		int diferenca = (A*B - C*D);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		
		
		int func = sc.nextInt();
		sc.nextLine();
		
		int horas = sc.nextInt();
		sc.nextLine();
		
		double valor = sc.nextDouble();
		sc.nextLine();
		
		double salario = horas * valor;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		
		int codigo, numP;
		double valorUni, total;
		total = 0;
		
		for(int x = 1; x < 3; x++) {
			codigo = sc.nextInt();
			//sc.nextLine();
			numP = sc.nextInt();
			//sc.nextLine();
			valorUni = sc.nextDouble();
			//sc.nextLine();
			
			total += numP*valorUni;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		*/
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159 * (C*C));
		System.out.printf("TRAPEZIO: %.3f%n", ((A+B) * C)/2 );
		System.out.printf("QUADRADO: %.3f%n", B*B);
		System.out.printf("RETANGULO: %.3f", A*B);
		
		
		sc.close();
		
		
		
	}

}
