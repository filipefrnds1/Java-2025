package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel2;

public class Worker2 {
	
	private String name;
	private WorkerLevel2 level;
	private Double baseSalary;
	
	private Department2 department;
	private List<HourContract2> contracts = new ArrayList<>();
	
	public Worker2() {
		
	}
	
	public Worker2(String name, WorkerLevel2 level, Double baseSalary, Department2 department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel2 getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel2 level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department2 getDepartment() {
		return department;
	}

	public void setDepartment(Department2 department) {
		this.department = department;
	}

	public void addContract(HourContract2 contract) {
		contracts.add(contract);
	}
	
	public void aremoveContract(HourContract2 contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		
		for(HourContract2 list : contracts) {
			
			int listYear = list.getDate().getYear();
			int listMonth = list.getDate().getMonthValue();
			
			if(year == listYear && month == listMonth) {
				sum = sum + list.totalValue();
			}
		}
		return sum;
	}
	
	
}
