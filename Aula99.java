import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula99 {

	public static void main(String[] args) {
		// Listas 
		
		List<String> list = new ArrayList<>(); // lista não aceita tipos primitivos, Obs: tem que instanciar a lista
						   						//  tem que usar a wrapper class do tipo inteiro ou de outro tipo
						  						//   generics pode parametrizar  a definição de um tipo informando outro tipo que voce quiser
		list.add("Arthur");
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add("Bob");
		list.add("Filipe");
		list.add(2, "Marco");
		list.add("José");
		list.add("Alberto");
		
		System.out.println(list.size());
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		list.remove("Ana");
		list.remove(1);
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // predicado, pega um valor x do tipo string e me retorna se esse x 
												// x.charArt 0 é igual a 'M'
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Filipe"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); //o index of retorna -1 quando nao encontra na lista
		System.out.println("---------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// .stream() aceita operações lambidas
		// .filter() aceita um predicado
		// .collect(Collectors.toList()) o stream nao é compatiel com list, precisa voltar pro tipo lista apos converter pra stream
		for(String x : result) {                  
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(name1);
	}

}
