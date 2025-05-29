package java_development_exeryoutube;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exer100_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		System.out.println();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			while(hasId(list,id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(new Employee(id,name,salary));
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int inc = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == inc).findFirst().orElse(null);
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double perc = sc.nextDouble();
			emp.percentSalary(perc);
		}else {
			System.out.println("This id does not exist !");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		
		
		
		
		sc.close();
	}
	
	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
