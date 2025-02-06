package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
		
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println("\nMEDIA DO VETOR = " + avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i=0; i<n; i++) {
			if (vect[i] < avg) {
				System.out.printf("\n%.1f", vect[i]);
			}
		}
		
		sc.close();
	}

}
