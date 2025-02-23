package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // pode colocar "String" dentro <>, mas assim funciona e deixa o código mais limpo
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // adiciona em uma posicao especifica
		
		System.out.println(list.size());
		
		for (String x : list ) { // para cada string x pertencente à lista list
			System.out.println(x);
		}	
		
		System.out.println("-------------------------");
		// list.remove("Anna");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); // remove toda string x tal que x.chartAt(0) seja igual a 0. É uma função lambda (predicado) que retorna true ou false
	
		for (String x : list ) {
			System.out.println(x);
		}	
	
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); // -1 quando elemento não existe
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		for (String x : result ) {
			System.out.println(x);
		}	
		
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
