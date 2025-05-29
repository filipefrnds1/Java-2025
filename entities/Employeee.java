package entities;

public class Employeee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employeee() {
		
	}
	
	public Employeee(int id, String name, double salary) {
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

	public void increaseSalary(double perc) {
		salary = salary + ((perc/100)*salary);
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", getSalary());
}

}
