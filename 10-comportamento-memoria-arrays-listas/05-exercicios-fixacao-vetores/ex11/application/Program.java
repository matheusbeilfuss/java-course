package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();

		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da " + (i + 1) + "a pessoa: ");
			
			double altura = sc.nextDouble();
			sc.nextLine();
			alturas[i] = altura;
			
			System.out.printf("Altura da" + (i + 1) + "a pessoa: ");
			
			char genero = sc.next().charAt(0);
			sc.nextLine();
			
			generos[i] = genero;
		}
		
		double menorAltura = 3;
		double maiorAltura = 0.0;
		double somaMulheres = 0.0;
		int numHomens = 0;
		int numMulheres = 0;
		
		for (int i=0; i<n; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			
			if (generos[i] == 'F') {
				numMulheres++;
				somaMulheres += alturas[i];
			}
			
			if (generos[i] == 'M') {
				numHomens++;
			}
		}
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f", (somaMulheres / numMulheres));
		System.out.println("\nNumero de homens = " + numHomens);
		
		sc.close();
	}

}
