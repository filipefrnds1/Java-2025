package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Exer94 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 
		 // FEITO COM VETORES 
		 
		String[] name = new String[10];
		String[] email = new String[10];
		String nome, mail;
		int rooms;
		
		System.out.print("How many rooms will be rented ? ");
		int N = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			mail = sc.nextLine();
			System.out.print("Room: ");
			rooms = sc.nextInt();
			name[rooms-1] = nome;
			email[rooms-1] = mail;
			System.out.println();
				
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(name[i] != null) {
				System.out.println((i+1) + ": " + name[i] + ", " + email[i]);
			}
		}
		
		*/
		
		// FEITO COM OBJETOS 
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		System.out.println();
		
		People[] p = new People[10];
		int rooms;
		String name,email;
		
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			rooms = sc.nextInt();
			System.out.println();
			
			p[rooms] = new People(name,email);
			
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < p.length; i++) {
			if(p[i] != null) {
				System.out.println((i) + ": " + p[i]);
			}
		}
		
		
		sc.close();
	}

}
