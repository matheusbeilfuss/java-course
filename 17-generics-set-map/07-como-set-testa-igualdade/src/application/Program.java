package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		// false quando Product não contém a implementação de hashCode e equals, utilizando ponteiros para comparar
		// true quando Product tem a implementação de hashCode e equals. A comparação foi pelo conteúdo, e não pela referência de ponteiro do objeto
		System.out.println(set.contains(prod));
		
		// É assim que set faz a comparação de objetos, tanto para verificar se contém quando para remover ou inserir
	}
}