package entities;

public class Empl {

	private Integer id;
	private String name;
	private Double salary;
	
	public Empl() {
		
	}

	public Empl(Integer id, String name, Double salary) {
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

	public void increaseSalary(double percentage) {
		salary = salary + salary * percentage /100.0;
	}
	
	@Override // override ajuda você a não errar
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", getSalary());
	}
	
	
}
