package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

public class ExerCondSe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
		
		if(x%2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
		
		
		
		int item = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		
		if(item == 1) {
			total = quantidade * 4.0;
		}else if(item == 2) {
			total = quantidade * 4.5;
		}else if(item == 3) {
			total = quantidade * 5.0;
		}else if(item == 4) {
			total = quantidade * 2.0;
		}else{
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		
		
		double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if(valor > 25 && valor <= 50) {
			System.out.println("Intervalo [25,50]");
		}else if(valor > 50 && valor <= 75) {
			System.out.println("Intervalo [50,75]");
		}else if(valor > 75 && valor <= 100) {
			System.out.println("Intervalo [75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		
		
		double numero = sc.nextDouble();
		
		if(numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if(numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if(numero <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if(numero <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}
		
		
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if(X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}
		else if(X > 0.0 && Y > 0.0) {
			System.out.println("Q1");
		}
		else if(X > 0.0 && Y < 0.0) {
			System.out.println("Q4");
		}
		else if(X < 0.0 && Y < 0.0) {
			System.out.println("Q3");
		}
		else if(X < 0.0 && Y > 0.0) {
			System.out.println("Q2");
		}
		else if(X == 0.0) {
			System.out.println("Eixo Y");
		}
		else {
			System.out.println("Eixo X");
		}
		
		*/
		
		
		double valor = sc.nextDouble();
		double imposto = 0;
		
		if(valor >= 0.00 && valor <= 2000.00) {
			imposto = 0.0;
		}
		else if(valor <= 3000.00) {
			imposto = (valor - 2000.0) * 0.08;
		}
		else if(valor <= 4500) {
			imposto = ((valor - 3000.0) * 0.18) + (1000.0 * 0.08);
		}
		else{
			imposto = ((valor - 4500.0) * 0.28) + (1500.0 * 0.18) + (1000.0 * 0.08);
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
		
		sc.close();

	}

}



