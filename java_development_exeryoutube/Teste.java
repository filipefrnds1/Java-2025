package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		 
		System.out.print("Quantas pessoas serão digitadas? ");
		int N = sc.nextInt();
		
		People[] p = new People[N];
		int menor = 0;
		double media = 0.0;
		double percetAge = 0.0;
		
		
		
		
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			p[i] = new People();
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			p[i].setName(sc.nextLine());
			System.out.print("Idade: ");
			p[i].setAge(sc.nextInt());
			System.out.print("Altura: ");
			p[i].setHeight(sc.nextDouble());
			media += p[i].getHeight();
			
			if(p[i].getAge() < 16) {
				menor += 1;
			}
		}
		
		media = media / p.length;
		percetAge = ((double)menor/N) * 100;
		
		System.out.printf("\nAltura média: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percetAge);
		for(int i = 0; i < p.length; i++) {
			if(p[i].getAge() < 16) {
				System.out.println(p[i].getName());
			}
		}
		
		sc.close();
	}

}
