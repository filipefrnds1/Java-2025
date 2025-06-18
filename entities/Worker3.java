package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel3;

public class Worker3 {
	
	private String name;
	private WorkerLevel3 level;
	private Double baseSalary;
	
	private Department3 department;
	private List<HourContract3> contracts = new ArrayList<>();
	
	public Worker3() {
		
	}
		
	public Worker3(String name, WorkerLevel3 level, Double baseSalary, Department3 department) {
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
	
	public WorkerLevel3 getLevel() {
		return level;
	}
	
	public void setLevel(WorkerLevel3 level) {
		this.level = level;
	}
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department3 getDepartment() {
		return department;
	}
	
	public void setDepartment(Department3 department) {
		this.department = department;
	}
	
	public void addContract(HourContract3 contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract3 contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		for(HourContract3 c: contracts) {
			
			int c_month = c.getDate().getMonthValue();
			int c_year = c.getDate().getYear();
			
			if(month == c_month && year == c_year) {
				sum = sum + c.totalValue();
			}
		}
		
		return sum;
	}
	
	

}
