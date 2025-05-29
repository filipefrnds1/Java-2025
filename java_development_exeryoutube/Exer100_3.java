package java_development_exeryoutube;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employeee;

public class Exer100_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Employeee> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			while(hasId(list,id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employeee(id,name,salary));
						
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Employeee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}else {
			System.out.println("This id does not exist! ");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employeee x : list) {
			System.out.println(x);
		}
		
				
		sc.close();
	}
	
	public static boolean hasId(List<Employeee> list, int id) {
		Employeee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
