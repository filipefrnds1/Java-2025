
public class Aula96 {

	public static void main(String[] args) {
		
		// Boxing, unboxing e wrapper classes
		// wrapper classes são classes equivalentes aos tipos primitivos
		// para fazer boxing e unboxing de forma natural, sem casting
		// wrapper classes tem o objetivo de tratar os tipos primitivos como classes
		// só que de uma forma transparente ao compilador, sem se preocupara em fazer casting
		// nos bancos da dados é muito comun a gente ter na tabela alguns campos que podem valer null
		// pra gente ter essa equivalencia entre o banco de dados e a classe na memoria
		// eu coloco os campos como classe e nao tipos primitivos
		int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);

		int y = obj * 2;
		
		System.out.println(y);
	}

}
