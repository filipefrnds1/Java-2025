package java_development_exeryoutube;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class Exer100 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		System.out.println();
		
	    List<Employees> list = new ArrayList<>();
		
	    for(int i = 1; i <= N; i++) {
	    	sc.nextLine();
	    	System.out.println("Employee #" + i);
	    	System.out.print("Id: ");
	    	int id = sc.nextInt();
	    	while(hasId(list,id)) {
	    		System.out.print("Id already taken. Try again: ");
	    		id = sc.nextInt();
	    	}
	    	
	    	System.out.print("Name: ");
	    	sc.nextLine();
	    	String name = sc.nextLine();
	    	System.out.print("Salary: ");
	    	double salary = sc.nextDouble();
	    	list.add(new Employees(id,name,salary));
	    	System.out.println();
	    }
	    
	    System.out.print("Enter the employee id that will have salary increase: ");
	    int inc = sc.nextInt();
	    Employees emp = list.stream().filter(x -> x.getId() == inc).findFirst().orElse(null);
	    
	    if(emp != null) {
	    	System.out.print("Enter the percentage: ");
	    	double percent = sc.nextDouble();
	    	emp.percentSalary(percent);
	    }
	    else
	    {
	    	System.out.println("This id does not exist!");
	    }
	      
	    
	    System.out.println();
	    System.out.println("List of employees:");
	    for(Employees x: list) {
	    	System.out.println(x);
	    }
		
		
		
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
			return emp != null;
		}

}
