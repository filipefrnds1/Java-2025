
public class Aula97 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("============================");
		
		for(String obj : vect) { // leitura: para cada objeto obj contido no vetor vect, faça
			System.out.println(obj);
		}
	}

}
