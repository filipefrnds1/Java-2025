package java_development_exeryoutube;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee5;

public class Exer100_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		List<Employee5> list = new ArrayList<>();
		
		for(int i=1; i <= N; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			
			
			
		}
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee5> list, int id) {
		
	}

}
