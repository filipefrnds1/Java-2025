package entities;

public class AccountBank {
	
	private String hold;
	private int number;
	private double balance;
	
	public AccountBank() {
		
	}	
	
	public AccountBank(String hold, int number) {
		this.hold = hold;
		this.number = number;
	}
	
	public AccountBank(String name, int number, double account) {
		this.hold = name;
		this.number = number;
		deposito(account);
	}
	
	public String getName() {
		return hold;
	}
	
	public void setName(String name) {
		this.hold = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getAccount() {
		return balance;
	}
	
	public void saque(double amount) {
		this.balance -= (amount + 5.00);
	}
	
	public void deposito(double amount) {
		this.balance += amount;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ hold
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
