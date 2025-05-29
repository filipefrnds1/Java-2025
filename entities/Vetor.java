package entities;

public class Vetor {
	
	private int num;
	private double numb;
	
	public Vetor() {
		
	}
	
	public Vetor(int num, double numb) {
		this.num = num;
		this.numb = numb;
	}
	
	public void setNumb(double numb){
		this.numb = numb;
	}
	
	public double getNumb() {
		return numb;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

}
