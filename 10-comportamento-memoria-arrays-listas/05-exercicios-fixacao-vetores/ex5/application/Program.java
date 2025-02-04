package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
		
		double biggestNumber = 0;
		int biggestNumberPosition = 0;
		
		for (int i=0; i<n; i++) {
			if (vect[i] > biggestNumber) {
				biggestNumber = vect[i];
				biggestNumberPosition = i;
			}
		}
		
		System.out.println();
		
		System.out.println("MAIOR VALOR = " + biggestNumber);
		System.out.println("POSICAO DO MAIOR VALOR = " + biggestNumberPosition);
		
		sc.close();
	}

}
