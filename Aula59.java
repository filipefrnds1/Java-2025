import java.util.Locale;
import java.util.Scanner;

public class Aula59 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");	 
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLoweCase: -" + s01 + "-"); // deixa toda a string em letras minusculas
		System.out.println("toUpperCase: -" + s02 + "-"); // deixa toda a string em letras maiusculas 
		System.out.println("trim: -" + s03 + "-"); // apaga os espaços iniciais e finais 
		System.out.println("substring(2): -" + s04 + "-"); // pega apenas o caracter da posição 2 em diante
		System.out.println("substring(2, 9): -" + s05 + "-"); // pega a partir do caracter dos e antes do 9
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // sempre que achar um a minusculo ele substitui por x
		System.out.println("replace('abc', 'xy'): -" + s07 + "-" ); // sempre que achar um abc troca por xy
		System.out.println("Index if 'bc': " + i); // ela receb o valor da primeira ocorrencia na string
		System.out.println("Last index of 'bc': " + j); // ela recebe o valor da ultima ocorrencia na string
		
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" "); // o split recorta a string e joga em um vetor recortando de acordo com o separador passado como parametro
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		
		
		sc.close();
		
		
	}

}
