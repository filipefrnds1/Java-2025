package java_development_exeryoutube;

import java.util.Locale;
import java.util.Scanner;

public class Exer104 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero de linhas da matriz: ");
		int M = sc.nextInt();
		System.out.print("Informe o numero de colunas da matriz: ");
		int N = sc.nextInt();
		
		int mat[][] = new int[M][N];
		
		System.out.println("Matriz :");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Informe um valor a ser procurada na matriz: ");
		int X = sc.nextInt();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if(i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
				}
				if(j < mat[i].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if(i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		
		sc.close();

	}

}
