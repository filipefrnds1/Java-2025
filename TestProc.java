
public class TestProc {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B) / 2 * h;
		
		System.out.println(area);
		
		int a, z;
		double resultado;
		
		a = 5;
		z = 2;
		
		resultado = (double) a / z; // CASTING  Obs: se tirar o (double) o resultado será 2.0 pois entende que é uma divisão de inteiros
		
		System.out.println(resultado);
		
		double j;
		int t;
		
		j = 5.0;
		t = (int) j;
		
		System.out.println(t);
		
		
	}

}
