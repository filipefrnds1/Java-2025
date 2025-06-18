package java_development_exeryoutube;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department2;
import entities.HourContract2;
import entities.Worker2;
import entities.enums.WorkerLevel2;

public class Exer124v2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departm = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker2 worker = new Worker2(name, WorkerLevel2.valueOf(level), baseSalary, new Department2(departm));
		
		System.out.print("How many contracts to this worker? ");
		int N = sc.nextInt();
						
		for(int i = 1; i <= N; i++) {
			
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract2 contract = new HourContract2(date,valuePerHour,hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String yearAndMonth = sc.next();
		int month = Integer.parseInt(yearAndMonth.substring(0,2));
		int year = Integer.parseInt(yearAndMonth.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + yearAndMonth + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
