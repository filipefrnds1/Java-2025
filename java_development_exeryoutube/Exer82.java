package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Exer82 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBank bank;
		
		System.out.print("Enter account number: ");
		int numb = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char value = sc.next().charAt(0);
		
		if(value == 'y') {
			System.out.print("Enter initial deposit value: ");
			double account1 = sc.nextDouble();
			bank = new AccountBank(name, numb, account1);
		}else {
			bank = new AccountBank(name, numb);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.deposito(deposit);
		System.out.println("Updated account data: ");
		System.out.println(bank.toString());
		System.out.println();
		
		System.out.print("Enter the withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.saque(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(bank.toString());
		
		
		sc.close();
	}

}
