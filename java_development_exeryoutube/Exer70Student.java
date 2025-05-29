package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exer70Student {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		stud.name = sc.nextLine();
		stud.n1 = sc.nextDouble();
		stud.n2 = sc.nextDouble();
		stud.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stud.NotaFinal());
		stud.ResultLast();
		
		
		
		sc.close();
	}

}
