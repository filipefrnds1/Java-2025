package entities;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void percentSalary(double percent) {
		salary = salary + (percent/100)*salary;
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ String.format(", %.2f", getSalary());
	}
	
}
