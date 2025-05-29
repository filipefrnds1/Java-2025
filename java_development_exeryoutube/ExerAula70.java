package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExerAula70 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario func = new Funcionario();
				
		System.out.print("Name: ");
		func.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
	    System.out.println();
		System.out.printf("Employee: %s, $ %.2f", func.name, func.NetSalary());
		System.out.println();
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		func.IncreaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println(func.toString());
		
		
		
		
		
		
		
		sc.close();
	}

}
