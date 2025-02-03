package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos pessoas serao digitadas? ");
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
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			
			vect[i] = pessoa;
		}
		
		double sum = 0;
		int count = 0;
		
		System.out.println();

		for (int i=0; i<n; i++) {
			sum += vect[i].getAltura();
			
			if (vect[i].getIdade() < 16) {
				count++;
			}
		}
		
		double avg = sum / n;
		
		System.out.printf("\nAltura média: %.2f\n", avg);
		
		double percentage = ((double) count / n) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);
		
		for (int i=0; i<n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
