package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // compara o conteúdo dos objetos
		System.out.println(c1 == c2); // compara as referências de memória, não o conteúdo
		System.out.println(s1 == s2); // true porque compilador trata expressões literais de modo diferente
		System.out.println(s3 == s4); // false porque aí está comparando objetos
	}
}