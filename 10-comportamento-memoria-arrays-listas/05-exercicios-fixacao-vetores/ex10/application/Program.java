package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos alunos serão digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Aluno[] vect = new Aluno[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");
			
			String nome = sc.nextLine();
			
			double nota1 = sc.nextDouble();
			sc.nextLine();
			
			double nota2 = sc.nextDouble();
			sc.nextLine();
			
			Aluno aluno = new Aluno(nome, nota1, nota2);
			
			vect[i] = aluno;
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			if (((vect[i].getNota1() + vect[i].getNota2()) / 2) >= 6) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
