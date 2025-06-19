package entities;

public class Employee5 {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee5() {
		
	}

	public Employee5(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double percentSalary(double perc) {
		return salary = salary + ((perc/100)*salary);
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
			
	}
	
	
	
	

}
