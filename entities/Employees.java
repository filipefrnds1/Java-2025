package entities;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees() {		
	}
	
	public Employees(Integer id) {
		this.id = id;	
	}
	
	public Employees(Integer id, String name) {
		this.id = id;
		this.name = name;		
	}
	
	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void percentSalary(double percent) {
		this.salary = this.salary + (this.salary*(percent/100));		
	}
	
	public String toString() {
		return id
				+", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
	
	

}
