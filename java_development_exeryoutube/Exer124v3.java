package java_development_exeryoutube;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department3;
import entities.HourContract3;
import entities.Worker3;
import entities.enums.WorkerLevel3;

public class Exer124v3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		
		System.out.print("Enter departmen's name: ");
		String depart = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker3 worker = new Worker3(name,WorkerLevel3.valueOf(level),baseSalary, new Department3(depart));
		
		System.out.print("How many contracts to this worker? ");
		int cont = sc.nextInt();
		
		for(int i = 1; i <= cont; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(),fmt1);
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			worker.addContract(new HourContract3(date,valuePerHour,hours));
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String dateIncome = sc.next();
		
		int month = Integer.parseInt(dateIncome.substring(0,2));
		int year = Integer.parseInt(dateIncome.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + dateIncome + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
