package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vect = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			Pessoa pessoa = new Pessoa(nome, idade);
			
			vect[i] = pessoa;
		}
		
		int oldestAge = 0;
		String oldestPerson = "";
		
		for (int i=0; i<n; i++) {
			if (vect[i].getIdade() > oldestAge) {
				oldestAge = vect[i].getIdade();
				oldestPerson = vect[i].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + oldestPerson);
		
		sc.close();
	}

}
