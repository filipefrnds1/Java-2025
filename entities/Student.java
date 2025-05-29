package entities;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double NotaFinal() {
		return n1+n2+n3;
	}
	
	public void ResultLast() {
		if(n1+n2+n3 >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-(n1+n2+n3) );
		}
	}

}
