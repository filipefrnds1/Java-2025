package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

public class ExerFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		int X = sc.nextInt();
		
		for(int i = 1; X >= i; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		
		int N = sc.nextInt();
		int X,in,out;
		in = 0;
		out = 0;
		for(int i = 0; N > i; i++) {
			X = sc.nextInt();
			if(X >= 10 && X <=20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; N > i; i++) {
			
			double m1 = sc.nextDouble();
			double m2 = sc.nextDouble();
			double m3 = sc.nextDouble();
			
			double mp = (m1*2) + (m2*3) + (m3*5);
			mp = mp / 10;
			
			System.out.printf("%.1f%n", mp);
			
		}
		
		
		int N = sc.nextInt();
		
		for(int i = 0; N > i; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if(y == 0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.println(x/y);
			}
		}
		 */
		/*
		int n = sc.nextInt();
		
		int fat = 1;
		for(int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		
		
		int N = sc.nextInt();
		
		for(int i = 1; N >= i; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		
		*/
		
		int n = sc.nextInt();
		
		for(int i = 1; n >= i; i++) {
			System.out.print(i + " ");
			System.out.print(i*i + " ");
			System.out.println(i*i*i);
		}
		
		sc.close();

	}

}
