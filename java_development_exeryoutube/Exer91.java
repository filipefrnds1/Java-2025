package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Exer91 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 
		// PROBLEMA "NEGATIVOS"
		 
		System.out.print("Quantos numeros ocê vai digitar ? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i<vect.length;i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		//=====================================================================
		
		// PROBLEMA "SOMA_VETOR"
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i<vect.length;i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		
		System.out.print("\nVALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		media = soma / vect.length;
		
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
		//==================================================================
		
		
		// PROBLEMA ALTURAS
		
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
		
		
		
		//=============================================================================
		
		// PROBLEMA NUMEROS PARES
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] pares = new int[N];
		int quant = 0;
		
		for(int i = 0; i < pares.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();
		}
		

		System.out.println("\nNUMEROS PARES: ");
		for(int i = 0; i < pares.length; i++) {
			
			
			if(pares[i]%2 == 0) {
				System.out.print(pares[i] + "  ");
				quant++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + quant);
		
		
		//============================================================================
		
		// PROBLEMA MAIOR POSIÇÃO
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] pares = new double[N];
		
		int pos = 0;
		double aux = 0;
		for(int i = 0; i < pares.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextDouble();
			if(pares[i] > aux) {
				aux = pares[i];
				pos = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f", aux);
		System.out.println("\nPOSIÇÃO DO MAIOR VALOR = " + pos);
		
		
		//============================================================================
		
		//PROBLEMA SOMA VETORES
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		Vetor[] vetA = new Vetor[N];
		Vetor[] vetB = new Vetor[N];
		Vetor[] vetSum = new Vetor[N];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			vetA[i] = new Vetor();
			vetA[i].setNum(sc.nextInt());
			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			vetB[i] = new Vetor();
			vetB[i].setNum(sc.nextInt());
			
		}
		
		for(int i = 0; i < vetSum.length; i++) {
			vetSum[i] = new Vetor();
			vetSum[i].setNum(vetA[i].getNum() + vetB[i].getNum());
		}
		
		
		
		System.out.println("VETOR RESULTANTE 1: ");
		for(int i = 0; i < N; i++) {
		System.out.println(vetA[i].getNum()+vetB[i].getNum());
			
		}
		
		System.out.println("VETOR RESULTANTE 2: ");
		for(int i = 0; i < N; i++) {
		System.out.println(vetSum[i].getNum());
			
		}
		
		
		
		//================================================================================================
		
		// PROBLEMA ABAIXO DA MEDIA
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		Vetor[] num = new Vetor[N];
		double numb = 0.0;
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < num.length; i++) {
			sc.nextLine();
			num[i] = new Vetor();
			System.out.print("Digite um numero: ");
			numb = sc.nextDouble();
			num[i].setNumb(numb);
			soma = soma + num[i].getNumb();
		}
		
		media = soma / num.length;
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < num.length; i++) {
			if(num[i].getNumb() < media) {
				System.out.println(num[i].getNumb());
			}
		}
		
		
		
		//================================================================================================
		
		//PROBLEMA MEDIA PARES
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		int[] vet = new int[N];
		double soma = 0.0;
		double media = 0.0;
		int pares = 0;
		
		for(int i = 0; i < vet.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			if(vet[i] % 2 == 0) {
				soma = soma + (double)vet[i];
				pares++;
			}
		}
		
		//media = soma / (double)pares;
		
		if(pares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media = soma / (double)pares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
		
		
		//======================================================================================================
		
		//PROBLEMA MAIS VELHO
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int N = sc.nextInt();
		People[] p = new People[N];
		int idade = 0;
		String name = "";
		
		for(int i = 0; i < p.length; i++) {
			sc.nextLine();
			p[i] = new People();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			p[i].setName(sc.nextLine());
			System.out.print("Idade: ");
			p[i].setAge(sc.nextInt());
			if(idade < p[i].getAge()) {
				idade = p[i].getAge();
				name = p[i].getName();
			}
			
		}
		
		System.out.println("PESSOA MAIS VELHA: " + name);
		
		
		
		//=========================================================================================================
		
		//PROBLEMA APROVADOS
		
		System.out.print("Quantos aluno serão digitados? ");
		int N = sc.nextInt();
		
		People[] studant = new People[N];
		double media = 0.0;
		
		for(int i = 0; i < studant.length; i++) {
			sc.nextLine();
			studant[i] = new People();
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "a aluno: ");
			studant[i].setName(sc.nextLine());
			studant[i].setNota1(sc.nextDouble());
			studant[i].setNota2(sc.nextDouble());
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < studant.length; i++) {
			media = (studant[i].getNota1() + studant[i].getNota2()) / 2;
			if(media >= 6.0) {
				System.out.println(studant[i].getName());
			}
		}
		
		*/
		
		//============================================================================================================
		
		//PROBLEMA DADOS PESSOAS
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		People[] p = new People[N];
		double menorAlt = 0;
		double maiorAlt = 0;
		double mediaAltMu = 0;
		int numHo = 0;
		int numMu = 0;
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new People();
			sc.nextLine();
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			p[i].setHeight(sc.nextDouble());
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			p[i].setGender(sc.next().charAt(0));		
			
		}
		
		menorAlt = p[0].getHeight();
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getHeight() < menorAlt) {
				menorAlt = p[i].getHeight();
			}
			
			if(p[i].getHeight() > maiorAlt) {
				maiorAlt = p[i].getHeight();
			}
		}
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getGender() == 'M') {
				numHo++;
			}
			else {
				numMu++;
				mediaAltMu = mediaAltMu + p[i].getHeight();
			}
		}
		
		mediaAltMu = mediaAltMu / numMu;
		
		System.out.printf("Menor altura = %.2f%n", menorAlt);
		System.out.printf("Maior altura = %.2f%n", maiorAlt);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltMu);
		System.out.println("Numero de homens = " + numHo);
		
		
		
		
		sc.close();
	}

}
