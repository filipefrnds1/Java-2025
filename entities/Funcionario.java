package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percent) {
		grossSalary += (grossSalary*0.10);
	}
	
	public String toString() {
		return "Updated data: "
				+ name
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}

}
