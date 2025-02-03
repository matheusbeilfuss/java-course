package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n]; 
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
			sum += vect[i];
		}
		
		System.out.printf("\nSOMA = %.2f\n", sum);
		
		double avg = sum / n;
		
		System.out.printf("MEDIA = %.2f\n", avg);
		
		sc.close();
	}

}
