package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Exer73 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.priceD = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cc.dollars = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", cc.calcConverter(cc.priceD, cc.dollars));
		sc.close();
		
	}

}
